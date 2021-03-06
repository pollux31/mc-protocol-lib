package ch.spacebase.mcprotocol.standard.packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import ch.spacebase.mcprotocol.net.Client;
import ch.spacebase.mcprotocol.net.ServerConnection;
import ch.spacebase.mcprotocol.packet.Packet;

public class PacketEntityLook extends Packet {

	public int entityId;
	public byte yaw;
	public byte pitch;

	public PacketEntityLook() {
	}

	public PacketEntityLook(int entityId, byte yaw, byte pitch) {
		this.entityId = entityId;
		this.yaw = yaw;
		this.pitch = pitch;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		this.entityId = in.readInt();
		this.yaw = in.readByte();
		this.pitch = in.readByte();
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		out.writeInt(this.entityId);
		out.writeByte(this.yaw);
		out.writeByte(this.pitch);
	}

	@Override
	public void handleClient(Client conn) {
	}

	@Override
	public void handleServer(ServerConnection conn) {
	}

	@Override
	public int getId() {
		return 32;
	}

}
