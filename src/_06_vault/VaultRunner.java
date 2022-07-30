package _06_vault;

public class VaultRunner {
	
	public static void main(String[] args) {
		
		Vault vault = new Vault();
		vault.tryCode(500000);
		SecretAgent secretAgent = new SecretAgent();
		System.out.println(secretAgent.findCode(vault));
		
	}
	
}
