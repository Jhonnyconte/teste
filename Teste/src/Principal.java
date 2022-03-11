import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
    	
    	
    	
    	Pessoa maria =  new Pessoa();
    	Funcionario mariaFunc = (Funcionario) maria;
    	maria.nome = "Maria";
    	maria.data = LocalDate.of(2000, 10, 18);    
    	mariaFunc.funcao  = "Operador";
    	mariaFunc.salario = 2009.44;
    	
    	Object[] mariaArr = { maria.nome, maria.data, mariaFunc.salario};
    	
    	Pessoa joao =  new Pessoa();
    	Funcionario joaoFunc = (Funcionario) joao;
    	joao.nome = "Joao";
    	joao.data = LocalDate.of(1990, 05, 12);    
    	joaoFunc.funcao  = "Operador";
    	joaoFunc.salario = 2284.38;
    	
    	Object[] joaoArr = { joao.nome, joao.data, joaoFunc.salario};
    	
    	
    	Pessoa caio =  new Pessoa();
    	Funcionario caioFunc = (Funcionario) caio;
    	caio.nome = "Caio";
    	caio.data = LocalDate.of(1961, 05, 02);    
    	caioFunc.funcao  = "Coordenador";
    	caioFunc.salario = 2284.38;
    	
    	Object[] caioArr = { caio.nome, caio.data, caioFunc.salario};
    	
    	
    	Pessoa miguel =  new Pessoa();
    	Funcionario miguelFunc = (Funcionario) miguel;
    	miguel.nome = "Miguel";
    	miguel.data = LocalDate.of(1988, 10, 14);    
    	miguelFunc.funcao  = "Diretor";
    	miguelFunc.salario = 19119.88;
    	
    	Object[] miguelArr = { miguel.nome, miguel.data, miguelFunc.salario};
   
    	Pessoa alice =  new Pessoa();
    	Funcionario aliceFunc = (Funcionario) alice;
    	alice.nome = "Alice";
    	alice.data = LocalDate.of(1995, 01, 05);    
    	aliceFunc.funcao  = "Recepcionista";
    	aliceFunc.salario = 2234.68;
    	
    	Object[] aliceArr = { alice.nome, alice.data, aliceFunc.salario};
    	
    	
    	Pessoa heitor =  new Pessoa();
    	Funcionario heitorFunc = (Funcionario) heitor;
    	heitor.nome = "Heitor";
    	heitor.data = LocalDate.of(1999, 11, 19);    
    	heitorFunc.funcao  = "Operador";
    	heitorFunc.salario = 1582.72;
    	
    	Object[] heitorArr = { heitor.nome, heitor.data, heitorFunc.salario};
    	
    	
    	Pessoa arthur =  new Pessoa();
    	Funcionario arthurFunc = (Funcionario) arthur;
    	arthur.nome = "Arthur";
    	arthur.data = LocalDate.of(1993, 03, 31);    
    	arthurFunc.funcao  = "Contador";
    	arthurFunc.salario = 4071.84;
    	
    	Object[] arthurArr = { arthur.nome, arthur.data, arthurFunc.salario};
    	
    	
    	
    	
    	Pessoa laura =  new Pessoa();
    	Funcionario lauraFunc = (Funcionario) laura;
    	laura.nome = "Laura";
    	laura.data = LocalDate.of(1994, 07, 08);    
    	lauraFunc.funcao  = "Gerente";
    	lauraFunc.salario = 3017.45;
    	
    	Object[] lauraArr = { laura.nome, laura.data, lauraFunc.salario};
    	
    	
    	Pessoa heloisa =  new Pessoa();
    	Funcionario heloisaFunc = (Funcionario) heloisa;
    	heloisa.nome = "Heloisa";
    	heloisa.data = LocalDate.of(2003, 05, 24);    
    	heloisaFunc.funcao  = "Eletricista";
    	heloisaFunc.salario = 1606.85;
    	
    	Object[] heloisaArr = { heloisa.nome, heloisa.data, heloisaFunc.salario};
    	
    	Pessoa helena =  new Pessoa();
    	Funcionario helenaFunc = (Funcionario) helena;
    	helena.nome = "Helena";
    	helena.data = LocalDate.of(1996, 09, 02);    
    	helenaFunc.funcao  = "Gerente";
    	helenaFunc.salario = 2799.93;
    	
    	Object[] helenaArr = { helena.nome, helena.data, helenaFunc.salario};
    		
        ArrayList<Object> lista = new ArrayList<>();
        lista.add(mariaArr);
        lista.add(joaoArr);
        lista.add(caioArr);
        lista.add(miguelArr);
        lista.add(aliceArr);
        lista.add(heitorArr);
        lista.add(arthurArr);
        lista.add(lauraArr);
        lista.add(heloisaArr);
        lista.add(helenaArr);
     
        System.out.println(lista);
        
        
        lista.remove(lista.indexOf(joaoArr));
        System.out.println(lista);
        
        
        
