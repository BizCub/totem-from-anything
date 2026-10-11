multiloader {
    setMREnvironment(mrEnvs.serverOnly)
    setCFEnvironment(cfEnvs.server)

    configureLoaders {
        if (isFabric) {
            addDependency(
                dependency = "net.fabricmc:fabric-loader:${getDep("fabric")}"
            )
        }
    }
}
