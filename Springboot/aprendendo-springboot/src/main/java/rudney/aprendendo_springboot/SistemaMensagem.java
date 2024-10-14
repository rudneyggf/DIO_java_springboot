package rudney.aprendendo_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
   private Remetente remetente;

    @Autowired
   private Remetente testePrototype;

   public void enviarConfirmacaoCadastro(){
       System.out.println(remetente);
       System.out.println("Cadastro confirmado com sucesso!");
   }

   public void enviarMensagemBoasVindas(){
       testePrototype.setEmail("jubilerdo@gmail.com");
       System.out.println(testePrototype);
       System.out.println("Mensagem enviada com sucesso!");
   }
}
