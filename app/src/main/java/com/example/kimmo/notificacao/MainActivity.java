package com.example.kimmo.notificacao;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

import static android.app.Notification.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNotificacao(View view){
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, new Intent(this, Atividade2.class), 0);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setTicker("Ticker Texto");
        builder.setContentTitle("Título");
        builder.setSmallIcon(R.drawable.iconios7bell128);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.bellxxl));
        builder.setContentIntent(pendingIntent);

        NotificationCompat.InboxStyle style = new NotificationCompat.InboxStyle();
        String [] descs = new String[]{"Descricao 1", "Descricao 2", "Descricao 3", "Descricao 4"};
        for (int i = 0; i < descs.length; i++){
            style.addLine(descs[i]);
        }
        builder.setStyle(style);

        Notification notification = builder.build();
        notification.vibrate = new long[]{150, 300, 150, 600};
        notification.flags = FLAG_AUTO_CANCEL;
        notificationManager.notify(R.drawable.iconios7bell128, notification);

        try {
            Uri som = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            Ringtone ringtone = RingtoneManager.getRingtone(this, som);
            ringtone.play();
        }
        catch (Exception e){}
    }

    public void gerarNotificacaoHeadsUp(View view) {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, new Intent(this, Atividade2.class), 0);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setTicker("Ticker Texto");
        builder.setContentTitle("Título");
        builder.setColor(Color.MAGENTA);
        builder.setFullScreenIntent(pendingIntent, false);
        builder.setVisibility(NotificationCompat.VISIBILITY_PRIVATE);
        builder.setSmallIcon(R.drawable.iconios7bell128);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.bellxxl));
        builder.setContentIntent(pendingIntent);

        NotificationCompat.InboxStyle style = new NotificationCompat.InboxStyle();
        String [] descs = new String[]{"Descricao 1", "Descricao 2", "Descricao 3", "Descricao 4"};
        for (int i = 0; i < descs.length; i++){
            style.addLine(descs[i]);
        }
        builder.setStyle(style);

        Notification notification = builder.build();
        notification.vibrate = new long[]{150, 300, 150, 600};
        notificationManager.notify(R.drawable.iconios7bell128, notification);

        try {
            Uri som = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            Ringtone ringtone = RingtoneManager.getRingtone(this, som);
            ringtone.play();
        }
        catch (Exception e){}
    }

    public void gerarNotificacaoTelaBloqueio(View view) {
        view.postDelayed(new Runnable() {
            @Override
            public void run() {
                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, new Intent(MainActivity.this, Atividade2.class), 0);

                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this);
                builder.setTicker("Ticker Texto");
                builder.setContentTitle("Título");
                builder.setColor(Color.MAGENTA);
                builder.setFullScreenIntent(pendingIntent, false);
                builder.setVisibility(NotificationCompat.VISIBILITY_PRIVATE);
                builder.setSmallIcon(R.drawable.iconios7bell128);
                builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.bellxxl));
                builder.setContentIntent(pendingIntent);

                NotificationCompat.InboxStyle style = new NotificationCompat.InboxStyle();
                String [] descs = new String[]{"Descricao 1", "Descricao 2", "Descricao 3", "Descricao 4"};
                for (int i = 0; i < descs.length; i++){
                    style.addLine(descs[i]);
                }
                builder.setStyle(style);

                Notification notification = builder.build();
                notification.vibrate = new long[]{150, 300, 150, 600};
                notificationManager.notify(R.drawable.iconios7bell128, notification);

                try {
                    Uri som = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                    Ringtone ringtone = RingtoneManager.getRingtone(MainActivity.this, som);
                    ringtone.play();
                }
                catch (Exception e){}
            }
        }, 2000);
    }

    public void gerarNotificacaoComAcao(View view) {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, new Intent(this, Atividade2.class), 0);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setTicker("Ticker Texto");
        builder.setContentTitle("Título");
        builder.setSmallIcon(R.drawable.iconios7bell128);
        builder.addAction(R.drawable.iconios7bell128, "Sino Menor", pendingIntent);
        builder.addAction(R.drawable.bellxxl, "Sino Maior", pendingIntent);
        builder.setContentIntent(pendingIntent);

        NotificationCompat.InboxStyle style = new NotificationCompat.InboxStyle();
        String [] descs = new String[]{"Descricao 1", "Descricao 2", "Descricao 3", "Descricao 4"};
        for (int i = 0; i < descs.length; i++){
            style.addLine(descs[i]);
        }
        builder.setStyle(style);

        Notification notification = builder.build();
        notification.vibrate = new long[]{150, 300, 150, 600};
        notificationManager.notify(R.drawable.iconios7bell128, notification);

        try {
            Uri som = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            Ringtone ringtone = RingtoneManager.getRingtone(this, som);
            ringtone.play();
        }
        catch (Exception e){}
    }

    public void abrirAtividade2(View view) {
        Intent intent = new Intent(this, Atividade2.class);
        startActivity(intent);
    }
}
