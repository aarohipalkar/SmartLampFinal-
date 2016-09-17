package hackcmu.smartlamp;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.io.IOException;
import java.util.Set;


import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;

import hackcmu.test.R;

//import hackcmu.smartlamp.R;


public class MainActivity extends AppCompatActivity {

    int i=0;

    Button buttonOn;
    Button buttonOff;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;

    OutputStream outputstream;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outputstream = null;
        configure();
        run();
    }

    public void run()
    {
        //final Button[] sectionButtons = new Button[]{(Button) findViewById(R.id.button1),(Button) findViewById(R.id.button2),(Button) findViewById(R.id.button3),(Button) findViewById(R.id.button4),(Button) findViewById(R.id.button5),(Button) findViewById(R.id.button6),(Button) findViewById(R.id.button7),(Button) findViewById(R.id.button8),(Button) findViewById(R.id.button9),(Button) findViewById(R.id.button10)};

        final Button buttonOn = (Button) findViewById(R.id.buttonOn);
        final Button buttonOff = (Button) findViewById(R.id.buttonOff);

        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button) findViewById(R.id.button8);
        final Button button9 = (Button) findViewById(R.id.button9);
        final Button button10 = (Button) findViewById(R.id.button10);

        buttonOff.setEnabled(false);

        //int i=0;

        buttonOn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                buttonOn.setEnabled(false);
                buttonOff.setEnabled(true);
                //Log.d("c", "d");
                if( outputstream != null)
                {
                    Log.d("c", "d");

                    try
                    {
                        outputstream.write(1);
                        Log.d("a", "b");
                    }
                    catch( Exception e)
                    {

                    }
                }

                button1.setOnClickListener(new View.OnClickListener()
                {
                    int count = 0;
                    @Override
                    public void onClick(View v)
                    {
                        count++;
                        if( outputstream != null)
                        {
                            try
                            {
                                outputstream.write('a');
                            }
                            catch( Exception e)
                            {
                            }
                        }
                        if( count%2 == 1)  //in deadzone
                            button1.setText( "X");
                        else //out of deadzone
                            button1.setText( "" );
                    }
                });

                button2.setOnClickListener(new View.OnClickListener()
               {
                   int count = 0;
                   @Override
                   public void onClick(View v)
                   {
                       count++;
                       if( outputstream != null)
                       {
                           try
                           {
                               outputstream.write('b');
                           }
                           catch( Exception e)
                           {
                           }
                       }
                       if( count%2 == 1)  //in deadzone
                           button2.setText( "X");
                       else //out of deadzone
                           button2.setText( "" );
                   }
               });

                button3.setOnClickListener(new View.OnClickListener()
               {
                   int count = 0;
                   @Override
                   public void onClick(View v)
                   {
                       count++;
                       if( outputstream != null)
                       {
                           try
                           {
                               outputstream.write('c');
                           }
                           catch( Exception e)
                           {
                           }
                       }
                       if( count%2 == 1)  //in deadzone
                           button3.setText( "X");
                       else //out of deadzone
                           button3.setText( "" );
                   }
               });

                button4.setOnClickListener(new View.OnClickListener()
               {
                  int count = 0;
                   @Override
                   public void onClick(View v)
                   {
                       count++;
                       if( outputstream != null)
                       {
                           try
                           {
                               outputstream.write('d');
                           }
                           catch( Exception e)
                           {
                           }
                       }
                       if( count%2 == 1)  //in deadzone
                           button4.setText( "X");
                       else //out of deadzone
                           button4.setText( "" );
                   }
               }) ;
                button5.setOnClickListener(new View.OnClickListener()
                {
                    int count = 0;
                    @Override
                    public void onClick(View v)
                    {
                        count++;
                        if( outputstream != null)
                        {
                            try
                            {
                                outputstream.write('e');
                            }
                            catch( Exception e)
                            {
                            }
                        }
                        if( count%2 == 1)  //in deadzone
                            button5.setText( "X");
                        else //out of deadzone
                            button5.setText( "" );
                    }
                }) ;

                button6.setOnClickListener(new View.OnClickListener()
                {
                    int count = 0;
                    @Override
                    public void onClick(View v)
                    {
                        count++;
                        if( outputstream != null)
                        {
                            try
                            {
                                outputstream.write('f');
                            }
                            catch( Exception e)
                            {
                            }
                        }
                        if( count%2 == 1)  //in deadzone
                            button6.setText( "X");
                        else //out of deadzone
                            button6.setText( "" );
                    }
                }) ;

                button7.setOnClickListener(new View.OnClickListener()
                {
                    int count = 7;
                    @Override
                    public void onClick(View v)
                    {
                        count++;
                        if( outputstream != null)
                        {
                            try
                            {
                                outputstream.write('g');
                            }
                            catch( Exception e)
                            {
                            }
                        }
                        if( count%2 == 1)  //in deadzone
                            button7.setText( "X");
                        else //out of deadzone
                            button7.setText( "" );
                    }
                }) ;

                button8.setOnClickListener(new View.OnClickListener()
                {
                    int count = 0;
                    @Override
                    public void onClick(View v)
                    {
                        count++;
                        if( outputstream != null)
                        {
                            try
                            {
                                outputstream.write('h');
                            }
                            catch( Exception e)
                            {
                            }
                        }
                        if( count%2 == 1)  //in deadzone
                            button8.setText( "X");
                        else //out of deadzone
                            button8.setText( "" );
                    }
                }) ;

                button9.setOnClickListener(new View.OnClickListener()
                {
                    int count = 9;
                    @Override
                    public void onClick(View v)
                    {
                        count++;
                        if( outputstream != null)
                        {
                            try
                            {
                                outputstream.write('i');
                            }
                            catch( Exception e)
                            {
                            }
                        }
                        if( count%2 == 1)  //in deadzone
                            button9.setText( "X");
                        else //out of deadzone
                            button9.setText( "" );
                    }
                }) ;

                button10.setOnClickListener(new View.OnClickListener()
                {
                    int count = 0;
                    @Override
                    public void onClick(View v)
                    {
                        count++;
                        if( outputstream != null)
                        {
                            try
                            {
                                outputstream.write('j');
                            }
                            catch( Exception e)
                            {i
                            }
                        }
                        if( count%2 == 1)  //in deadzone
                            button10.setText( "X");
                        else //out of deadzone
                            button10.setText( "" );
                    }
                }) ;

   /*             for(i = 0; i < sectionButtons.length; i++)
                {
                    sectionButtons[i].setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View v)
                        {
                            deadzone(sectionButtons[i]);
                            //calibrate();
                        }
                    });
                }
    */        }
        });

        buttonOff.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                buttonOff.setEnabled(false);
                buttonOn.setEnabled(true);
                if( outputstream != null)
                {
                    try
                    {
                        outputstream.write(0);
                    }
                    catch( Exception e)
                    {

                    }
                }
            }
        });


    }

    public void deadzone(Button button)
    {

    }

    public void configure()
    {
        BluetoothAdapter btAdapter;
        btAdapter = BluetoothAdapter.getDefaultAdapter();

        if (btAdapter==null)
        {
            Toast.makeText(getApplicationContext(), "No bluetooth detected" , Toast.LENGTH_SHORT).show();
            finish();
        }
        else
        {
            if(!btAdapter.isEnabled())
            {
                Intent enableAdapter = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(enableAdapter, 0);
            }

        }

        BluetoothDevice device = null;
        Set<BluetoothDevice> bondedDevices = btAdapter.getBondedDevices();
        if(bondedDevices.isEmpty()) {
            Toast.makeText(getApplicationContext(),"Please Pair the Device first",Toast.LENGTH_SHORT).show();
        } else {
            for (BluetoothDevice btdev : bondedDevices) {
                if(btdev.getAddress().equals("20:16:07:25:94:38")) //Replace with iterator.getName() if comparing Device names.
                {
                    device = btdev; //device is an object of type BluetoothDevice
                    boolean found=true;
                    break;
                } } }


        try
        {
           UUID uid = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
            Log.d("a", "dksgj");
            BluetoothSocket socket = null;
            if(uid != null && device != null)
                socket = device.createRfcommSocketToServiceRecord(uid );
            if (socket != null ) {
                socket.connect();
                outputstream = socket.getOutputStream();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }





}


