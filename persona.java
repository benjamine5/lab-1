class persona{
    //atributos
    String nombre;
    int fecha;
    int rut;

    persona(String nombre; int fecha; int rut){
        this.nombre = nombre;
        this.fecha = fecha;
        this.rut = rut;
    }

    void toString(){

    }

    void esMayorDeEdad(){
        int[] this.fecha = new int[3]
    }

    void validarRut(){
        public static object[] invertir(Object[] array) {
        Object[] invertir_int = new Object[array.length];
        int maximo = array.length;

        for (int i = 0; i < array.length; i++) {
            Object j = array[maximo - 1];
            invertir_int[maximo - 1] = array[i];
            maximo--;
        }
        return invertir_int;

        int a = 2;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt((String) array[i]) * a;
            rutSumado += Integer.parseInt(String.valueOf(array[i]));
            if (a == 7) {
            a = 1;
        }
        a++;
        }

        int resto = rutSumado % 11;
        String Digito = String.valueOf(11 - resto);
            if (Digito.equals("11")) {
            Digito = "0";
        }

        if (Digito.equals("10")) {
            Digito = "K";
        }
    }
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getFecha(){
        return this.fecha;
    }

    public String getRut(){
        return this.rut;
    }

    public void setNombre(String newName){
        this.nombre = newNombre;
    }

    
}
