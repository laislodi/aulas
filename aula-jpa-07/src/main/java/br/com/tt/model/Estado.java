package br.com.tt.model;

public enum Estado {
	AC("Acre"), AL("Alagoas"), AM("Amazonas"), AP("Amap�"), BA("Bahia"), CE("Cear�"),
	DF("Distrito Federal"), ES("Esp�rito Santo"), GO("Goi�s"), MA("Maranh�o"), MT ("Mato Grosso"), MS("Mato Grosso do Sul"), 
	MG("Minas Gerais"), PA("Par�"), PB("Para�ba"), PE("Pernambuco"), PI("Piau�"), PR("Paran�"), 
	RJ("Rio de Janeiro"), RS("Rio Grande do Sul"), RN("Rio Grande do Norte"), RO("Rond�nia"), RR("Roraima"),SC("Santa Catarina"),
	SP("S�o Paulo"), SE("Sergipe"), TO("Tocantins");

	private String descricao;
	
	private Estado(String descricao) {
		this.descricao = descricao; 
	}
	
	public String getDescricao() {
		return descricao;
	} 
	
	
			
}
