class Teste {
      public static void main(String args[]) {
            Cliente objCliente = new Cliente();
            System.out.println(objCliente);
            objCliente.setNome("Gerundio");
            Cliente churros = new Cliente();
            System.out.println(churros);
            churros = new Cliente();
            System.out.println(churros);
            //System.out.println(objCliente.nome); n�o funciona
            System.out.println(objCliente.getNome());
            objCliente.setId(1234);
            System.out.println(objCliente.getId());
            objCliente.setCpf("4882334");
            System.out.println(objCliente.getCpf());
            objCliente.setEmail("chris@email.com");
            System.out.println(objCliente.getEmail());
            churros.setTudo("Marquinhos", 43324, "987878", "marquino@mail.coi");
            System.out.println(churros.getTudo());
      }
}
/*o modificador static representa a princ�pio que esta classe n�o ir� gerar qualquer objeto*/
/*Cliente churros = new Cliente();
  System.out.println(churros);
Esse c�digo n�o funcionou porque o objeto Churros j� existia antes*/