public class Executavel {

    public static void main (String[] args) {

     //APLICAÇÃO 1

     Funcionario FuncAtendente = new Funcionario();
     Funcionario FuncGerente = new Funcionario();

     Cargo Atendente = new Cargo();
     Cargo Gerente = new Cargo();

     FuncAtendente.addCargo(Atendente);
     FuncGerente.addCargo(Gerente);

     FuncAtendente.setNome("José Carlos");
     FuncAtendente.setCpf("591.344.707-78");
     FuncAtendente.setSalario(10000.0);

     FuncGerente.setNome("Bruna Sousa");
     FuncGerente.setCpf("330.048.041-82");
     FuncGerente.setSalario(30000.0);

     //APLICAÇÃO 2

     Cliente kv = new Cliente();
     kv.setNome("Kevin");
     kv.setCpf("450.365.344-09");
     kv.setVip(true);

     Endereco vk = new Endereco();
     vk.setLogradouro("Rua União das Vilas");
     vk.setComplemento("Sitio Bom Jesus");
     vk.setNumero("22");
     vk.setCidade("São Bernardo do Campo");
     vk.setUf("SP");
     vk.setCep("09840-800");
     kv.addEndereco(vk);

     Endereco vkK = new Endereco();
     vkK.setLogradouro("Rua Santa Cruz");
     vkK.setComplemento("Canhema");
     vkK.setNumero("1264");
     vkK.setCidade("Diadema");
     vkK.setUf("SP");
     vkK.setCep("09940-550");
     kv.addEndereco(vkK);

     Endereco vkKv = new Endereco();
     vkKv.setLogradouro("José Homero Marostegan");
     vkKv.setComplemento("Jardim Campos Eliseos");
     vkKv.setNumero("169");
     vkKv.setCidade("Campinas");
     vkKv.setUf("SP");
     vkKv.setCep("13060-047");
     kv.addEndereco(vkKv);

     System.out.println("Enderecos: ");
     System.out.println(kv.imprimirEnderecos());

     //APLICAÇÃO 3

     Cliente kvv = new Cliente();
     kvv.setNome("Leandro Silva");
     kvv.setCpf("804.796.837-86");
     kvv.setVip(true);

     ContaCorrente conCorr = new ContaCorrente();
     conCorr.setNumero("400");
     conCorr.setLimite(5000.0);
     kvv.addConta(conCorr);

     conCorr.depositar(100.0);
     conCorr.depositar(100.0);
     conCorr.depositar(100.0);
     conCorr.sacar(50.0);
     conCorr.calcularSaldo();

     //APLICAÇÃO 4

     Cliente outro = new Cliente();
     outro.setNome("Elon Musk");
     outro.setCpf("575.276.948-58");
     outro.setVip(false);

     ContaCorrente ContaCorrenteElon = new ContaCorrente();
     ContaCorrenteElon.setNumero("650");
     ContaCorrenteElon.setLimite(1000.0);
     outro.addConta(ContaCorrenteElon);

     ContaCorrenteElon.depositar(1000.0);

     ContaPoupanca ContaPoupancaElon = new ContaPoupanca();

     ContaPoupancaElon.depositar(1000.0);

     ContaCorrenteElon.transferir(ContaPoupancaElon, 500.0);
     ContaPoupancaElon.calcularSaldo();
     ContaCorrenteElon.calcularSaldo();
    }
}
