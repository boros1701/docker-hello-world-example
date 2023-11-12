job('Gradle build for Java app') {
    scm {
        git('https://github.com/boros1701/luminor_task.git'){
           node / gitConfigName('DSL User')
           node / gitConfigEmail('boros2y6@inbox.lv')
    }
    triggers {
        scm ('H/5 * * * *')
    }
    steps {
        gradle 'assemble'
    }
}
