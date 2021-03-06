package ch.spacebase.mcprotocol.standard.packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import ch.spacebase.mcprotocol.net.Client;
import ch.spacebase.mcprotocol.net.ServerConnection;
import ch.spacebase.mcprotocol.packet.Packet;

public class PacketServerPing extends Packet {

	private static final byte MAGIC = 1;

	public PacketServerPing() {
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		in.readByte();
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		out.writeByte(MAGIC);
	}

	@Override
	public void handleClient(Client conn) {
	}

	@Override
	public void handleServer(ServerConnection conn) {
	}

	@Override
	public int getId() {
		return 254;
	}

}
