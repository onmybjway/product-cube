package com.productcube.res

/*

 */
abstract class Resource {
    String key
    String name


    static constraints = {
        key(unique: true)
        name()
    }
}
