// import javax.swing.JApplet;
// /**
//  * Main Program to run as an applet
//  * The display area is 640x480. 
//  */
// public class MainApplet extends JApplet {
//    @Override
//    public void init() {
//       // Run UI in the Event Dispatcher Thread
//       javax.swing.SwingUtilities.invokeLater(new Runnable() {
//          public void run() {
//             setContentPane(new BallWorld(640, 480)); // BallWorld is a JPanel
//          }
//       });
//    }
// }