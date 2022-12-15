import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Pessoa implements IUsuario {

    private Boolean vip;

    private Collection<Endereco> enderecos = new ArrayList<>();

    //CONTA

    private Collection<Conta> contas = new ArrayList<>();

    public Collection<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Collection<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }


    public void addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public void addContaCorrente (ContaCorrente contaCorrente) {
        this.contas.add(contaCorrente);
    }

    public boolean imprimirEnderecos () {
        for (Endereco e : getEnderecos()) {
            System.out.println("Logradouro: " + e.getLogradouro() + ", Numero: " + e.getNumero() + ", Cidade: " + e.getCidade() + ", UF: " + e.getUf() + ", Complemento: " + e.getComplemento());
        }
        return false;
    }
    public void addConta(Conta conta) {
        this.contas.add(conta);
        }

    private String nome;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public boolean autenticar(String nome, String senha) {
        if (this.getNome() == nome) {
            if (this.getSenha() == senha) {
                return true;
            } else {
                System.out.println("Senha Incorreta");
            }
            return false;
        }
        System.out.println("Nome incorreto");
        {
            return true;
        }
    }
}

