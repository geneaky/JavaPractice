package justcode;

import java.net.http.WebSocket;
import java.nio.ByteBuffer;
import java.util.concurrent.CompletionStage;

class Adapter implements WebSocket.Listener{
    @Override
    public void onOpen(WebSocket webSocket) {
        System.out.println("AdapterClass only use this method in listener");
    }

    @Override
    public CompletionStage<?> onText(WebSocket webSocket, CharSequence data, boolean last) {
        return null;
    }

    @Override
    public CompletionStage<?> onBinary(WebSocket webSocket, ByteBuffer data, boolean last) {
        return null;
    }

    @Override
    public CompletionStage<?> onPing(WebSocket webSocket, ByteBuffer message) {
        return null;
    }

    @Override
    public CompletionStage<?> onPong(WebSocket webSocket, ByteBuffer message) {
        return null;
    }

    @Override
    public CompletionStage<?> onClose(WebSocket webSocket, int statusCode, String reason) {
        return null;
    }

    @Override
    public void onError(WebSocket webSocket, Throwable error) {

    }
}

public class ListenerAndAdapter {

    public static void main(String[] args) {
        WebSocket webSocket = null;
        Adapter adapter = new Adapter();
        adapter.onOpen(webSocket);
    }
}
