package com.productcube.res

class DeployedApp {
    String name
    AppSource source

    static belongsTo = [server: Server]

    static constraints = {
        name(unique: true)
        server()

    }

    @Override
    public String toString() {
        return name;
    }
}
