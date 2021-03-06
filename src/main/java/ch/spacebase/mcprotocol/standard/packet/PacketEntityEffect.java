package ch.spacebase.mcprotocol.standard.packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import ch.spacebase.mcprotocol.net.Client;
import ch.spacebase.mcprotocol.net.ServerConnection;
import ch.spacebase.mcprotocol.packet.Packet;

public class PacketEntityEffect extends Packet {

	public int entityId;
	public byte effect;
	public byte amplifier;
	public short duration;

	public PacketEntityEffect() {
	}

	public PacketEntityEffect(int entityId, byte effect, byte amplifier, short duration) {
		this.entityId = entityId;
		this.effect = effect;
		this.amplifier = amplifier;
		this.duration = duration;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		this.entityId = in.readInt();
		this.effect = in.readByte();
		this.amplifier = in.readByte();
		this.duration = in.readShort();
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		out.writeInt(this.entityId);
		out.writeByte(this.effect);
		out.writeByte(this.amplifier);
		out.writeShort(this.duration);
	}

	@Override
	public void handleClient(Client conn) {
	}

	@Override
	public void handleServer(ServerConnection conn) {
	}

	@Override
	public int getId() {
		return 41;
	}

}
