package t1;

public class PacketInWindow {
	
	private TftpPacket packet;
	private boolean isAcked;
	private int numRetries;
	private long timeout; //tempo maximo para chegar
	
	public PacketInWindow(TftpPacket packet, long timeout){
		this.packet = packet;
		isAcked = false;
		this.timeout = timeout;
		numRetries = 0;
	}
	
	public TftpPacket getPacket(){
		return packet;
	}
	
	public boolean getIsAcked(){
		return isAcked;
	}
	
	public int getNumRetries(){
		return numRetries;
	}
	
	public long getTimeout(){
		return timeout;
	}
	
	public void addRetry(){
		numRetries++;
	}
	
	public void setIsAcked(){
		isAcked = true;
	}
	
	public void setTimeout(long newTimeout){
		timeout = newTimeout;
	}
	
	public long getSeqNumber(){
		return packet.getBlockSeqN();
	}
}
