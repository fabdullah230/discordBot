package discordBotRevived;



import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Shomaj {
   public static void main(String[] args) throws LoginException {
      JDA jda = null;
      reply r = new reply();
      JDABuilder jdaBuilder = JDABuilder.createDefault("NzY5Mjc5MTA5NzIxMDk2MTky.X5MtAA.3XOlw5DiuVg6ReQ_QR-bjtJi-bs");
      jdaBuilder.addEventListeners(new Object[]{r});
      jdaBuilder.build();
   }
}