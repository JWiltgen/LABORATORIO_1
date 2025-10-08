public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor com validação
    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Definindo data padrão: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    // Método auxiliar para validar a data
    private boolean validarData(int dia, int mes, int ano) {
        // Verifica se o mês é válido
        if (mes < 1 || mes > 12) {
            return false;
        }

        // Verifica se o dia é válido
        if (dia < 1) {
            return false;
        }

        // Dias por mês
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Ajusta fevereiro se for ano bissexto
        if (verificaAnoBissexto(ano)) {
            diasPorMes[1] = 29;
        }

        // Verifica se o dia está dentro do limite do mês
        if (dia > diasPorMes[mes - 1]) {
            return false;
        }

        return true;
    }

    // Método para verificar se o ano é bissexto (sobrecarga para validação interna)
    private boolean verificaAnoBissexto(int ano) {
        if (ano % 400 == 0) {
            return true;
        } else if (ano % 100 == 0) {
            return false;
        } else if (ano % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Método verificaAnoBissexto (público, conforme especificação)
    public boolean verificaAnoBissexto() {
        return verificaAnoBissexto(this.ano);
    }

    // Métodos de acesso (getters e setters)
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método toString
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
