package shall.domain;

public enum PessoaEnum {
    PESSOA_CLIENTE("Cliente", 1),
    PESSOA_FUNCIONARIO("Funcionário", 2);
    String relatorioNome;
    int idPessoa;

    PessoaEnum(String relatorioNome, int idPessoa) {
        this.relatorioNome = relatorioNome;
        this.idPessoa = idPessoa;
    }
    // Função para imprimir o relatório do tipo de pessoa, comparando o nome do relatório com o nome do tipo de pessoa.
    public static PessoaEnum imprimirRelatorioPessoa(String relatorioNome){
        for(PessoaEnum tipoPessoa : PessoaEnum.values()){
            if(tipoPessoa.equals(relatorioNome)){
                return tipoPessoa;
            }
        }
        return null;
    }

    public String getRelatorioNome() {
        return relatorioNome;
    }

    public int getIdPessoa() {
        return idPessoa;
    }
}
