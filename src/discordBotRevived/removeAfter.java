package discordBotRevived;


import net.dv8tion.jda.api.events.message.MessageReceivedEvent;




public class removeAfter implements Runnable{

	Thread t;
	long l;
	MessageReceivedEvent e;
	
	removeAfter(long l, MessageReceivedEvent e){
		t = new Thread(this, "thread");
		this.l = l;
		this.e = e;
		t.start();	
	}
		
	@Override
	public void run() {
		try {
			Thread.sleep(l);
			e.getGuild().kickVoiceMember(e.getMember()).complete();				
			e.getChannel().sendMessage("Removed " + e.getAuthor().getName() + " after " + l/60000 + " minute(s)").queue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}