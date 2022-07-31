package com.example.demo

import org.springframework.data.neo4j.core.mapping.Neo4jMappingContext
import org.springframework.stereotype.Component

@Component
class Monitor(private val neo4jMappingContext: Neo4jMappingContext) {

    init {
        for (entity in neo4jMappingContext.persistentEntities.sortedBy { it.primaryLabel }) {
            println(entity.primaryLabel)
            println(entity.staticLabels)
            for (child in entity.childNodeDescriptionsInHierarchy) {
                println("- ${child.primaryLabel}")
            }
            println()
        }
    }

}