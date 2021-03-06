package ch.spacebase.mcprotocol.standard.packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import ch.spacebase.mcprotocol.net.Client;
import ch.spacebase.mcprotocol.net.ServerConnection;
import ch.spacebase.mcprotocol.packet.Packet;

public class PacketUseBed extends Packet {

	public int entityId;
	public byte unknown;
	public int x;
	public byte y;
	public int z;

	public PacketUseBed() {
	}

	public PacketUseBed(int entityId, byte unknown, int x, byte y, int z) {
		this.entityId = entityId;
		this.unknown = unknown;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		this.entityId = in.readInt();
		this.unknown = in.readByte();
		this.x = in.readInt();
		this.y = in.readByte();
		this.z = in.readInt();
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		out.writeInt(this.entityId);
		out.writeByte(this.unknown);
		out.writeInt(this.x);
		out.writeByte(this.y);
		out.writeInt(this.z);
	}

	@Override
	public void handleClient(Client conn) {
	}

	@Override
	public void handleServer(ServerConnection conn) {
	}

	@Override
	public int getId() {
		return 17;
	}

}
