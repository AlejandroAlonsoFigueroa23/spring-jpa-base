// Librerias que se usaran
libraries{
    maven    
}

application_environments{
    sandbox{
        stage = 'sandbox'
    }
    prod{
        ignore = true
        stage = 'production'
    }
}
