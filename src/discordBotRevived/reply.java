package discordBotRevived;



import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Invite;
import net.dv8tion.jda.api.entities.VoiceChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.AttachmentOption;
import net.dv8tion.jda.internal.utils.IOUtil;

public class reply extends ListenerAdapter {
   String[][] replies = new String[][]{{"intro", "Ami komal"}, {"nahin", "Heyyy Bhaiia ^_^"}, {"ahnaf", "daddyyy <3"}, {"onie", "bhotkachoda murubbi"}, {"parash", "MEow mEoW"}, {"sayem", "RAw eMotIon Rawr rAwrr"}, {"fardin", "Lord Simp"}, {"inan", "aap"}, {"saleh", "belles"}, {"mondol", "tithykhor"}, {"shuvo", "thx 4 being sch a gd frnd :)"}, {"priya", "im anafs littol pikasu <3"}};

   public void onMessageReceived(MessageReceivedEvent e) {
      if (e.getAuthor().getName().equals("monsol")) {
         if (e.getMessage().getContentRaw().length() <= 15) {
            e.getMessage().addReaction("\ud83d\ude02").queue();
         } else if (e.getMessage().getContentRaw().length() > 15 && e.getMessage().getContentRaw().length() <= 25) {
            e.getChannel().sendMessage("বাংলা পরীক্ষা").queue();
            e.getChannel().sendMessage(":clown::joy::clown:").queue();
            e.getMessage().addReaction("😂😂").queue();
         } else if (e.getMessage().getContentRaw().length() > 25 && e.getMessage().getContentRaw().length() < 35) {
            e.getChannel().sendMessage("kotha kom").queue();
            e.getMessage().addReaction("\ud83e\udd2b").queue();
            e.getGuild().kickVoiceMember(e.getMember()).complete();
         } else if (e.getMessage().getContentRaw().length() >= 35) {
            e.getChannel().sendMessage("barit zaa \ud83d\udc4b \ud83d\udc4b \ud83d\udc4b").queue();

            try {
               long i = 3000L + (long)Math.random() * 7000L;
               Thread.sleep(i);
            } catch (InterruptedException var11) {
               var11.printStackTrace();
            }

            e.getGuild().kick(e.getMember()).complete();
         }
      }

      if (e.getMessage().getContentRaw().toLowerCase().equals("!test")) {
         e.getChannel().sendMessage("Komal...").queue();
      }

      if (e.getMessage().getContentRaw().toLowerCase().equals("kick me")) {
         e.getChannel().sendMessage("Bye bye").queue();
         e.getGuild().kickVoiceMember(e.getMember()).complete();
      }
      
      if (e.getMessage().getContentRaw().toLowerCase().contains("remove me after")) {
    	  int value = Integer.parseInt(e.getMessage().getContentRaw().replaceAll("[^0-9]", ""));
          e.getChannel().sendMessage("Removing "+ e.getAuthor().getName()+ " after " + value + " minute(s)").queue();
          new removeAfter((long)(value*60000), e);
       }

      byte[] file;
      EmbedBuilder embed;
      if (e.getMessage().getContentRaw().toLowerCase().contains("paige") && e.getMessage().getContentRaw().toLowerCase().contains("onie")) {
         embed = new EmbedBuilder();
         file = null;

         try {
            file = IOUtil.readFully((new URL("https://pbs.twimg.com/media/EAXoiDYXkAM4eTL.jpg")).openStream());
         } catch (MalformedURLException var9) {
            var9.printStackTrace();
         } catch (IOException var10) {
            var10.printStackTrace();
         }

         embed.setImage("attachment://cat.png").setDescription("Onie <3 Paige");
         e.getChannel().sendFile(file, "oniepaige.png", new AttachmentOption[0]).embed(embed.build()).queue();
      }

      if (e.getMessage().getContentRaw().toLowerCase().contains("meme") && e.getMessage().getContentRaw().toLowerCase().contains("manob")) {
         embed = new EmbedBuilder();
         file = null;

         try {
            file = IOUtil.readFully((new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcT3Y6b8aYcicTF-qxNNP-85Ya_bTKdibel4pw&usqp=CAU")).openStream());
         } catch (MalformedURLException var7) {
            var7.printStackTrace();
         } catch (IOException var8) {
            var8.printStackTrace();
         }

         embed.setImage("attachment://cat.png").setDescription("meme man");
         e.getChannel().sendFile(file, "mememanob.png", new AttachmentOption[0]).embed(embed.build()).queue();
      }

      if (e.getMessage().getContentRaw().toLowerCase().contains("kick") && e.getMessage().getContentRaw().toLowerCase().contains("sayem")) {
         e.getChannel().sendMessage("Bye bye sayem \ud83d\ude18").queue();

         try {
            Thread.sleep(3000L);
         } catch (InterruptedException var6) {
            var6.printStackTrace();
         }

         e.getGuild().kickVoiceMember(e.getGuild().getMemberByTag("à¦¬à¦‚ à¦¬à¦¨à§�à¦§à§�#5975")).complete();
         e.getGuild().kickVoiceMember(e.getGuild().getMemberByTag("monsol#3607")).complete();
      }

      if (e.getMessage().getContentRaw().toLowerCase().equals("mute sayem")) {
         e.getChannel().sendMessage("Sayem muted").queue();
         e.getGuild().mute(e.getGuild().getMemberByTag("à¦¬à¦‚ à¦¬à¦¨à§�à¦§à§�#5975"), true).complete();
         e.getGuild().mute(e.getGuild().getMemberByTag("monsol#3607"), true).complete();
      }

      if (e.getMessage().getContentRaw().toLowerCase().equals("unmute sayem")) {
         e.getChannel().sendMessage("Sayem unmuted").queue();
         e.getGuild().mute(e.getGuild().getMemberByTag("à¦¬à¦‚ à¦¬à¦¨à§�à¦§à§�#5975"), false).complete();
         e.getGuild().mute(e.getGuild().getMemberByTag("monsol#3607"), false).complete();
      }

      if (e.getMessage().getContentRaw().toLowerCase().contains("kick") && e.getMessage().getContentRaw().toLowerCase().contains("onie")) {
         e.getChannel().sendMessage("Bye bye Onie \ud83d\ude18").queue();

         try {
            Thread.sleep(1500);
         } catch (InterruptedException var5) {
            var5.printStackTrace();
         }
         
         for(VoiceChannel channel : e.getGuild().getVoiceChannels()){
        	 if(channel.getName().equalsIgnoreCase("Rudaba \ud83d onie")){
        		 
        	 }
        	 else{
        		 e.getGuild().createVoiceChannel("Rudaba \ud83d onie");
        	 }
        	 
         }
         
         //e.getGuild().createVoiceChannel("Rudaba \ud83d onie");
         e.getGuild().moveVoiceMember(e.getGuild().getMemberByTag("theundeadocco#7283"), e.getGuild().getVoiceChannelById("Rudaba \ud83d onie")).complete();
         
      }
      
      if (e.getMessage().getContentRaw().toLowerCase().contains("kick") && e.getMessage().getContentRaw().toLowerCase().contains("shuvo")) {
          e.getChannel().sendMessage("Bye bye Shuvo \ud83d\ude18").queue();

          try {
             Thread.sleep(3000L);
          } catch (InterruptedException var5) {
             var5.printStackTrace();
          }

          e.getGuild().kickVoiceMember(e.getGuild().getMemberByTag("[L]urKinG#6677")).complete();
       }

      if (e.getMessage().getContentRaw().toLowerCase().equals("mute onie")) {
         e.getChannel().sendMessage("Onie muted").queue();
         e.getGuild().mute(e.getGuild().getMemberByTag("theundeadocco#7283"), true).complete();
      }

      if (e.getMessage().getContentRaw().toLowerCase().equals("unmute onie")) {
         e.getChannel().sendMessage("Onie unmuted").queue();
         e.getGuild().mute(e.getGuild().getMemberByTag("theundeadocco#7283"), false).complete();
      }

      if (e.getAuthor().getName().equals("à¦“à¦°à¦¾") && e.getMessage().getContentRaw().equals("komal")) {
         e.getChannel().sendMessage("AAPni amader bondhu").queue();
         e.getChannel().sendMessage(":people_hugging::people_hugging::people_hugging:").queue();
      }

      if (e.getMessage().getContentRaw().equals("!invite")) {
         e.getChannel().sendMessage(((Invite)e.getTextChannel().createInvite().complete()).getUrl()).queue();
         System.out.println(((Invite)e.getTextChannel().createInvite().complete()).getUrl());
      }

      for(int i = 0; i < this.replies.length; ++i) {
         if (e.getMessage().getContentRaw().toLowerCase().equals(this.replies[i][0])) {
            e.getChannel().sendMessage(this.replies[i][1]).queue();
         }
      }

   }
}






