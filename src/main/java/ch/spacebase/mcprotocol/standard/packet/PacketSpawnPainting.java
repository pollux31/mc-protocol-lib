package ch.spacebase.mcprotocol.standard.packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import ch.spacebase.mcprotocol.net.Client;
import ch.spacebase.mcprotocol.net.ServerConnection;
import ch.spacebase.mcprotocol.packet.Packet;
import ch.spacebase.mcprotocol.util.IOUtils;

public class PacketSpawnPainting extends Packet {

	public int entityId;
	public String title;
	public int x;
	public int y;
	public int z;
	public int direction;

	public PacketSpawnPainting() {
	}

	public PacketSpawnPainting(int entityId, String title, int x, int y, int z, int direction) {
		this.entityId = entityId;
		this.title = title;
		this.x = x;
		this.y = y;
		this.z = z;
		this.direction = direction;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		this.entityId = in.readInt();
		this.title = IOUtils.readString(in);
		this.x = in.readInt();
		this.y = in.readInt();
		this.z = in.readInt();
		this.direction = in.readInt();
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		out.writeInt(this.entityId);
		IOUtils.writeString(out, this.title);
		out.writeInt(this.x);
		out.writeInt(this.y);
		out.writeInt(this.z);
		out.writeInt(this.direction);
	}

	@Override
	public void handleClient(Client conn) {
	}

	@Override
	public void handleServer(ServerConnection conn) {
	}

	@Override
	public int getId() {
		return 25;
	}

}
