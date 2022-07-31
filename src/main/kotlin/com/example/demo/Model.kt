package com.example.demo

import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node

@Node
abstract class A1 {
    @Id
    var id: String? = null
}

@Node
abstract class A2 : A1()

@Node
abstract class A3 : A2()

@Node
class A4 : A3()


@Node
abstract class B1 {
    @Id
    var id: String? = null
}

@Node
abstract class B2 : B1()

@Node
class B2a : B2()

@Node
abstract class B3 : B2()

@Node
class B3a : B3()