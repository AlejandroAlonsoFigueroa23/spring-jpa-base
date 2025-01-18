// Librerias que se usaran
libraries{
    maven    
}

application_environments{
    sandbox{
        ignore = true
        stage = 'sandbox'
    }
    prod{
        ignore = true
        stage = 'production'
    }
    dev{
        ignore = true
        stage = 'dev'
    }
}
