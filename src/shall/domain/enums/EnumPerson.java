package shall.domain.enums;

public enum EnumPerson {
    PERSON_CLIENT("Client", 1),
    PERSON_EMPLOYEE("Employee", 2);
    String reportName;
    int idPerson;

    EnumPerson(String reportName, int idPessoa) {
        this.reportName = reportName;
        this.idPerson = idPessoa;
    }
    // Função para imprimir o relatório do tipo de pessoa, comparando o nome do relatório com o nome do tipo de pessoa.
    public static EnumPerson imprimirRelatorioPessoa(String relatorioNome){
        for(EnumPerson typePerson : EnumPerson.values()){
            if(typePerson.equals(relatorioNome)){
                return typePerson;
            }
        }
        return null;
    }

    public String getReportName() {
        return reportName;
    }

    public int getIdPerson() {
        return idPerson;
    }
}
