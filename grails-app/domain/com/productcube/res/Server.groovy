package com.productcube.res

/*

 */
class Server extends Resource {
    String IP1
    String IP2
    String IP3
    String IP4
    String CPU
    Integer memory
    Integer storageSize

    static hasMany = [deployedApps: DeployedApp]

    static constraints = {
        CPU()
    }

    @Override
    public String toString() {
        return name
    }
}