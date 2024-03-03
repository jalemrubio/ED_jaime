class Metro {
    var estado = estados.PARADO
    private set

    fun siguienteEstado() {
        when(estado)
        {
            estados.PARADO -> estado = estados.ARRANCANDO
            estados.ARRANCANDO -> estado = estados.EN_MARCHA
            estados.EN_MARCHA -> estado = estados.PARANDO
            estados.PARANDO -> estado = estados.PARADO
            else -> throw RuntimeException("Estado desconocido")
        }
    }

    fun printEstado() :String {
        var nombreEstado: String
        when(estado)
        {
            estados.PARADO -> nombreEstado = "Parado"
            estados.ARRANCANDO -> nombreEstado = "Arrancando"
            estados.EN_MARCHA -> nombreEstado = "En marcha"
            estados.PARANDO -> nombreEstado = "Parando"
            else -> nombreEstado = "Estado desconocido"
        }
        return nombreEstado
    }

    enum class estados { PARADO, ARRANCANDO, EN_MARCHA, PARANDO }
  /*  companion object {
        protected const val PARADO = 0
        protected const val ARRANCANDO = 1
        protected const val EN_MARCHA = 2
        protected const val PARANDO = 3
    }*/
}
