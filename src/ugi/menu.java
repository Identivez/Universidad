/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ugi;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensajes;
import cjb.ci.Validaciones;
import java.awt.Color;
import menu.Alumnos;
import menu.Datos;
import menu.HistorialClinico;
import menu.Menu;
import static menu.Menu.convertirStringABoolean;
import menu.Personal;
import ugi.ca;

/**
 *
 * @author ghael
 */
public class menu extends javax.swing.JFrame
{
    int xMouse, yMouse;
    public static Datos a[] = null;
    public static HistorialClinico H[][] = null;

    public menu()
    {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        VerMas1.setText("<html>Ver más</html>");
        VerMas2.setText("<html>Ver más</html>");
        VerMas3.setText("<html>Ver más</html>");
        VerMas4.setText("<html>Ver más</html>");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        PanelMenu = new javax.swing.JPanel();
        PanelIzq = new javax.swing.JPanel();
        Inicio = new javax.swing.JPanel();
        TxtInicio = new javax.swing.JLabel();
        Funcion = new javax.swing.JPanel();
        TxtFuncion = new javax.swing.JLabel();
        Alumnos = new javax.swing.JPanel();
        TxtAlumnos = new javax.swing.JLabel();
        Personal = new javax.swing.JPanel();
        TxtPersonal = new javax.swing.JLabel();
        Enfermeria = new javax.swing.JPanel();
        TxtEnfermeria = new javax.swing.JLabel();
        TextoUNIVERSIDAD = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CierreCompleto = new javax.swing.JLabel();
        PanelSuperior = new javax.swing.JPanel();
        TxtInicio2 = new javax.swing.JLabel();
        TablaOpciones = new javax.swing.JTabbedPane();
        PanelInicio = new javax.swing.JPanel();
        Bienvenidos = new javax.swing.JLabel();
        CuadroFuncion = new javax.swing.JPanel();
        TxtFuncion2 = new javax.swing.JLabel();
        PanelVerMas = new javax.swing.JPanel();
        VerMas1 = new javax.swing.JLabel();
        CuadroAlumnos = new javax.swing.JPanel();
        TxtAlumnos2 = new javax.swing.JLabel();
        PanelVerMas2 = new javax.swing.JPanel();
        VerMas2 = new javax.swing.JLabel();
        CuadroPersonal = new javax.swing.JPanel();
        TxtPersonal2 = new javax.swing.JLabel();
        PanelVerMas3 = new javax.swing.JPanel();
        VerMas3 = new javax.swing.JLabel();
        CuadrosEnfermeria = new javax.swing.JPanel();
        TxtEnfermeria2 = new javax.swing.JLabel();
        PanelVerMas4 = new javax.swing.JPanel();
        VerMas4 = new javax.swing.JLabel();
        PanelFuncion = new javax.swing.JPanel();
        TituloFuncion = new javax.swing.JPanel();
        TituloComoFunciona1 = new javax.swing.JLabel();
        CuadroSalirFun = new javax.swing.JPanel();
        TxtSalirFun = new javax.swing.JLabel();
        PanelAlumnos = new javax.swing.JPanel();
        TablaAlumno = new javax.swing.JTabbedPane();
        PanelAlumno = new javax.swing.JPanel();
        TxtAlumnoPanel = new javax.swing.JLabel();
        CuadroRNA = new javax.swing.JPanel();
        TxtRegistroAl = new javax.swing.JLabel();
        CuadroMA = new javax.swing.JPanel();
        TxtModificacionesAl = new javax.swing.JLabel();
        CuadroCA = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        CuadroRIA = new javax.swing.JPanel();
        TxtReporteInfAl = new javax.swing.JLabel();
        CuadroSalirAl = new javax.swing.JPanel();
        TxtSalirAl = new javax.swing.JLabel();
        TxtConsultaAl = new javax.swing.JLabel();
        CuadroRNAl = new javax.swing.JPanel();
        TxtRNAlu = new javax.swing.JLabel();
        CuadroSalirRNA = new javax.swing.JPanel();
        TxtSalirRNA = new javax.swing.JLabel();
        TxtNombreRNA = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        TxtApellidoPatRNA = new javax.swing.JLabel();
        primerAp = new javax.swing.JTextField();
        TxtApellidoMatRNA = new javax.swing.JLabel();
        segundoAp = new javax.swing.JTextField();
        TxtGeneroA = new javax.swing.JLabel();
        ComboBoxSexoA1 = new javax.swing.JComboBox<>();
        TxtDesnutricionA = new javax.swing.JLabel();
        ComboBoxDesnutricionA1 = new javax.swing.JComboBox<>();
        TxtAlergiasA = new javax.swing.JLabel();
        ComboBoxAlergiasA1 = new javax.swing.JComboBox<>();
        TxtOtraEnfRNA = new javax.swing.JLabel();
        otrasenfermedades = new javax.swing.JTextField();
        TxtMatriculaRNA = new javax.swing.JLabel();
        cve = new javax.swing.JTextField();
        TxtViveConRNA = new javax.swing.JLabel();
        ComboBoxViveConA1 = new javax.swing.JComboBox<>();
        TxtCarreraRNA = new javax.swing.JLabel();
        ComboBoxCarreraA1 = new javax.swing.JComboBox<>();
        BotonAceptarRNA = new javax.swing.JButton();
        BotonCancelarAlum = new javax.swing.JButton();
        TxtObesidadA1 = new javax.swing.JLabel();
        ComboBoxObesidadA1 = new javax.swing.JComboBox<>();
        TxtSobrepesoA1 = new javax.swing.JLabel();
        ComboBoxSobrepesoA1 = new javax.swing.JComboBox<>();
        TxtDiabetesA1 = new javax.swing.JLabel();
        ComboBoxDiabetesA1 = new javax.swing.JComboBox<>();
        CuadroMAlu = new javax.swing.JPanel();
        TxtMAlu = new javax.swing.JLabel();
        CuadroSalirMA = new javax.swing.JPanel();
        TxtModAlu = new javax.swing.JLabel();
        CuadroCAlu = new javax.swing.JPanel();
        TxtCAlu = new javax.swing.JLabel();
        CuadroSalirCA = new javax.swing.JPanel();
        TxtSalirCA = new javax.swing.JLabel();
        CuadroRIAlu = new javax.swing.JPanel();
        TxtRIAlu = new javax.swing.JLabel();
        CuadroSalirRIA = new javax.swing.JPanel();
        TxtSalirRIA = new javax.swing.JLabel();
        PanelPersonal = new javax.swing.JPanel();
        TablaPersonal = new javax.swing.JTabbedPane();
        PanelPersonal2 = new javax.swing.JPanel();
        TxtPersonalPanel = new javax.swing.JLabel();
        CuadroRNP = new javax.swing.JPanel();
        TxtRNP = new javax.swing.JLabel();
        CuadroMP = new javax.swing.JPanel();
        TxtMP = new javax.swing.JLabel();
        CuadroCP = new javax.swing.JPanel();
        TxtCP = new javax.swing.JLabel();
        CuadroRIP = new javax.swing.JPanel();
        TxtRIP = new javax.swing.JLabel();
        CuadroSalirP = new javax.swing.JPanel();
        TxtSalirP = new javax.swing.JLabel();
        CuadroRNPer = new javax.swing.JPanel();
        TxtPersonalRN = new javax.swing.JLabel();
        TxtNombreRNP = new javax.swing.JLabel();
        TxtApePatRNP = new javax.swing.JLabel();
        TxtApeMatP = new javax.swing.JLabel();
        TxtGeneroRNP = new javax.swing.JLabel();
        TxtDesnutricionRNP = new javax.swing.JLabel();
        TxtAlergiasRNP = new javax.swing.JLabel();
        TxtOtraEnferRNP = new javax.swing.JLabel();
        TxtMatriculaRNP = new javax.swing.JLabel();
        TxtViveConRNP = new javax.swing.JLabel();
        BotonAceptarRNP = new javax.swing.JButton();
        BotonCancelarPer = new javax.swing.JButton();
        nombrePer = new javax.swing.JTextField();
        primerApPer = new javax.swing.JTextField();
        segundoApPer = new javax.swing.JTextField();
        oEnferPer = new javax.swing.JTextField();
        cvePer = new javax.swing.JTextField();
        ComboBoxSexoP1 = new javax.swing.JComboBox<>();
        ComboBoxDesnutricionP1 = new javax.swing.JComboBox<>();
        ComboBoxAlergiasP1 = new javax.swing.JComboBox<>();
        ComboBoxEstatusP1 = new javax.swing.JComboBox<>();
        TxtObesidadA2 = new javax.swing.JLabel();
        TxtSobrepesoA2 = new javax.swing.JLabel();
        TxtDiabetesA2 = new javax.swing.JLabel();
        ComboBoxObesidadP1 = new javax.swing.JComboBox<>();
        ComboBoxSobrepesoP1 = new javax.swing.JComboBox<>();
        ComboBoxDiabetesP1 = new javax.swing.JComboBox<>();
        CuadroSalirRNPer = new javax.swing.JPanel();
        TxtRNPer = new javax.swing.JLabel();
        CuadroMPer = new javax.swing.JPanel();
        TxtMPer = new javax.swing.JLabel();
        CuadroSalirMPer = new javax.swing.JPanel();
        TxtSalirMPer = new javax.swing.JLabel();
        CuadroCPer = new javax.swing.JPanel();
        TxtCPer = new javax.swing.JLabel();
        CuadroSalirCPer = new javax.swing.JPanel();
        TxtSalirCPer = new javax.swing.JLabel();
        CuadroRIPer = new javax.swing.JPanel();
        TxtRIPer = new javax.swing.JLabel();
        CuadroSalirRIPer = new javax.swing.JPanel();
        TxtSalirRIP = new javax.swing.JLabel();
        PanelEnfermeria = new javax.swing.JPanel();
        TituloEnfermeria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        PanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelIzq.setBackground(new java.awt.Color(204, 204, 255));

        Inicio.setBackground(new java.awt.Color(255, 255, 204));
        Inicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                InicioMouseMoved(evt);
            }
        });
        Inicio.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                InicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                InicioMouseExited(evt);
            }
        });
        Inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtInicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        TxtInicio.setForeground(new java.awt.Color(51, 51, 51));
        TxtInicio.setText("Inicio");
        TxtInicio.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                TxtInicioMouseClicked(evt);
            }
        });
        Inicio.add(TxtInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        Funcion.setBackground(new java.awt.Color(255, 255, 255));
        Funcion.setForeground(new java.awt.Color(255, 255, 255));
        Funcion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                FuncionMouseMoved(evt);
            }
        });
        Funcion.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                FuncionMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                FuncionMouseExited(evt);
            }
        });
        Funcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtFuncion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        TxtFuncion.setForeground(new java.awt.Color(51, 51, 51));
        TxtFuncion.setText("Función");
        Funcion.add(TxtFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        Alumnos.setBackground(new java.awt.Color(204, 0, 153));
        Alumnos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                AlumnosMouseMoved(evt);
            }
        });
        Alumnos.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                AlumnosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                AlumnosMouseExited(evt);
            }
        });
        Alumnos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtAlumnos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        TxtAlumnos.setForeground(new java.awt.Color(51, 51, 51));
        TxtAlumnos.setText("Alumnos");
        Alumnos.add(TxtAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        Personal.setBackground(new java.awt.Color(0, 153, 153));
        Personal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                PersonalMouseMoved(evt);
            }
        });
        Personal.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                PersonalMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                PersonalMouseExited(evt);
            }
        });
        Personal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtPersonal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        TxtPersonal.setForeground(new java.awt.Color(51, 51, 51));
        TxtPersonal.setText("Personal");
        Personal.add(TxtPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        Enfermeria.setBackground(new java.awt.Color(0, 102, 102));
        Enfermeria.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                EnfermeriaMouseMoved(evt);
            }
        });
        Enfermeria.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                EnfermeriaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                EnfermeriaMouseExited(evt);
            }
        });
        Enfermeria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtEnfermeria.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        TxtEnfermeria.setForeground(new java.awt.Color(51, 51, 51));
        TxtEnfermeria.setText("Enfermeria");
        Enfermeria.add(TxtEnfermeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        TextoUNIVERSIDAD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextoUNIVERSIDAD.setForeground(new java.awt.Color(0, 51, 51));
        TextoUNIVERSIDAD.setText("UNIVERSIDAD");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jPanel1MousePressed(evt);
            }
        });

        CierreCompleto.setBackground(new java.awt.Color(204, 204, 255));
        CierreCompleto.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        CierreCompleto.setText("   X");
        CierreCompleto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CierreCompleto.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CierreCompletoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                CierreCompletoMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(CierreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CierreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout PanelIzqLayout = new javax.swing.GroupLayout(PanelIzq);
        PanelIzq.setLayout(PanelIzqLayout);
        PanelIzqLayout.setHorizontalGroup(
            PanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzqLayout.createSequentialGroup()
                .addGroup(PanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Alumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelIzqLayout.createSequentialGroup()
                        .addGroup(PanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Funcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Inicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelIzqLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(TextoUNIVERSIDAD))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Personal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Enfermeria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(PanelIzqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelIzqLayout.setVerticalGroup(
            PanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzqLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(TextoUNIVERSIDAD)
                .addGap(37, 37, 37)
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Funcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Personal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Enfermeria, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        PanelMenu.add(PanelIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 610));

        PanelSuperior.setBackground(new java.awt.Color(204, 204, 255));

        TxtInicio2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtInicio2.setText("Inicio");

        javax.swing.GroupLayout PanelSuperiorLayout = new javax.swing.GroupLayout(PanelSuperior);
        PanelSuperior.setLayout(PanelSuperiorLayout);
        PanelSuperiorLayout.setHorizontalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(TxtInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(408, Short.MAX_VALUE))
        );
        PanelSuperiorLayout.setVerticalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(TxtInicio2)
                .addGap(42, 42, 42))
        );

        PanelMenu.add(PanelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 600, 90));

        TablaOpciones.setBackground(new java.awt.Color(255, 255, 255));
        TablaOpciones.setForeground(new java.awt.Color(204, 204, 204));

        PanelInicio.setBackground(new java.awt.Color(255, 255, 255));

        Bienvenidos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Bienvenidos.setText("Bienvenidos");

        CuadroFuncion.setBackground(new java.awt.Color(255, 255, 255));
        CuadroFuncion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TxtFuncion2.setBackground(new java.awt.Color(255, 255, 255));
        TxtFuncion2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtFuncion2.setText("Función");

        PanelVerMas.setBackground(new java.awt.Color(204, 204, 255));
        PanelVerMas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                PanelVerMasMouseMoved(evt);
            }
        });
        PanelVerMas.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                PanelVerMasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                PanelVerMasMouseExited(evt);
            }
        });

        VerMas1.setText("Ver más");

        javax.swing.GroupLayout PanelVerMasLayout = new javax.swing.GroupLayout(PanelVerMas);
        PanelVerMas.setLayout(PanelVerMasLayout);
        PanelVerMasLayout.setHorizontalGroup(
            PanelVerMasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVerMasLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(VerMas1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        PanelVerMasLayout.setVerticalGroup(
            PanelVerMasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerMasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VerMas1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CuadroFuncionLayout = new javax.swing.GroupLayout(CuadroFuncion);
        CuadroFuncion.setLayout(CuadroFuncionLayout);
        CuadroFuncionLayout.setHorizontalGroup(
            CuadroFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroFuncionLayout.createSequentialGroup()
                .addComponent(TxtFuncion2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroFuncionLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(PanelVerMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CuadroFuncionLayout.setVerticalGroup(
            CuadroFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroFuncionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxtFuncion2)
                .addGap(133, 133, 133)
                .addComponent(PanelVerMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        CuadroAlumnos.setBackground(new java.awt.Color(255, 255, 255));
        CuadroAlumnos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TxtAlumnos2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtAlumnos2.setText("Alumnos");

        PanelVerMas2.setBackground(new java.awt.Color(204, 204, 255));
        PanelVerMas2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                PanelVerMas2MouseMoved(evt);
            }
        });
        PanelVerMas2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                PanelVerMas2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                PanelVerMas2MouseExited(evt);
            }
        });

        VerMas2.setText("Ver más");

        javax.swing.GroupLayout PanelVerMas2Layout = new javax.swing.GroupLayout(PanelVerMas2);
        PanelVerMas2.setLayout(PanelVerMas2Layout);
        PanelVerMas2Layout.setHorizontalGroup(
            PanelVerMas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVerMas2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(VerMas2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        PanelVerMas2Layout.setVerticalGroup(
            PanelVerMas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerMas2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VerMas2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CuadroAlumnosLayout = new javax.swing.GroupLayout(CuadroAlumnos);
        CuadroAlumnos.setLayout(CuadroAlumnosLayout);
        CuadroAlumnosLayout.setHorizontalGroup(
            CuadroAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroAlumnosLayout.createSequentialGroup()
                .addComponent(TxtAlumnos2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroAlumnosLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(PanelVerMas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CuadroAlumnosLayout.setVerticalGroup(
            CuadroAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroAlumnosLayout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(TxtAlumnos2)
                .addGap(137, 137, 137)
                .addComponent(PanelVerMas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        CuadroPersonal.setBackground(new java.awt.Color(255, 255, 255));
        CuadroPersonal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TxtPersonal2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtPersonal2.setText("Personal");

        PanelVerMas3.setBackground(new java.awt.Color(204, 204, 255));
        PanelVerMas3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                PanelVerMas3MouseMoved(evt);
            }
        });
        PanelVerMas3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                PanelVerMas3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                PanelVerMas3MouseExited(evt);
            }
        });

        VerMas3.setText("Ver más");

        javax.swing.GroupLayout PanelVerMas3Layout = new javax.swing.GroupLayout(PanelVerMas3);
        PanelVerMas3.setLayout(PanelVerMas3Layout);
        PanelVerMas3Layout.setHorizontalGroup(
            PanelVerMas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVerMas3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(VerMas3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        PanelVerMas3Layout.setVerticalGroup(
            PanelVerMas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerMas3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VerMas3, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CuadroPersonalLayout = new javax.swing.GroupLayout(CuadroPersonal);
        CuadroPersonal.setLayout(CuadroPersonalLayout);
        CuadroPersonalLayout.setHorizontalGroup(
            CuadroPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroPersonalLayout.createSequentialGroup()
                .addComponent(TxtPersonal2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroPersonalLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(PanelVerMas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CuadroPersonalLayout.setVerticalGroup(
            CuadroPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroPersonalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxtPersonal2)
                .addGap(136, 136, 136)
                .addComponent(PanelVerMas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        CuadrosEnfermeria.setBackground(new java.awt.Color(255, 255, 255));
        CuadrosEnfermeria.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TxtEnfermeria2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtEnfermeria2.setText("Enfermeria");

        PanelVerMas4.setBackground(new java.awt.Color(204, 204, 255));
        PanelVerMas4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                PanelVerMas4MouseMoved(evt);
            }
        });
        PanelVerMas4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                PanelVerMas4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                PanelVerMas4MouseExited(evt);
            }
        });

        VerMas4.setText("Ver más");

        javax.swing.GroupLayout PanelVerMas4Layout = new javax.swing.GroupLayout(PanelVerMas4);
        PanelVerMas4.setLayout(PanelVerMas4Layout);
        PanelVerMas4Layout.setHorizontalGroup(
            PanelVerMas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVerMas4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(VerMas4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        PanelVerMas4Layout.setVerticalGroup(
            PanelVerMas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerMas4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VerMas4, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CuadrosEnfermeriaLayout = new javax.swing.GroupLayout(CuadrosEnfermeria);
        CuadrosEnfermeria.setLayout(CuadrosEnfermeriaLayout);
        CuadrosEnfermeriaLayout.setHorizontalGroup(
            CuadrosEnfermeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadrosEnfermeriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelVerMas4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(CuadrosEnfermeriaLayout.createSequentialGroup()
                .addComponent(TxtEnfermeria2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        CuadrosEnfermeriaLayout.setVerticalGroup(
            CuadrosEnfermeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadrosEnfermeriaLayout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addComponent(TxtEnfermeria2)
                .addGap(139, 139, 139)
                .addComponent(PanelVerMas4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout PanelInicioLayout = new javax.swing.GroupLayout(PanelInicio);
        PanelInicio.setLayout(PanelInicioLayout);
        PanelInicioLayout.setHorizontalGroup(
            PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInicioLayout.createSequentialGroup()
                        .addComponent(CuadroFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(CuadroAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(CuadroPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 36, Short.MAX_VALUE)
                        .addComponent(CuadrosEnfermeria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelInicioLayout.createSequentialGroup()
                        .addComponent(Bienvenidos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelInicioLayout.setVerticalGroup(
            PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInicioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Bienvenidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CuadrosEnfermeria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CuadroPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CuadroAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CuadroFuncion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        TablaOpciones.addTab("tab1", PanelInicio);

        PanelFuncion.setBackground(new java.awt.Color(255, 255, 255));

        TituloFuncion.setBackground(new java.awt.Color(255, 255, 255));

        TituloComoFunciona1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TituloComoFunciona1.setText("¿Cómo funciona el panel?");

        CuadroSalirFun.setBackground(new java.awt.Color(204, 204, 255));
        CuadroSalirFun.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroSalirFunMouseMoved(evt);
            }
        });
        CuadroSalirFun.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroSalirFunMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroSalirFunMouseExited(evt);
            }
        });

        TxtSalirFun.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirFun.setText("Salir");

        javax.swing.GroupLayout CuadroSalirFunLayout = new javax.swing.GroupLayout(CuadroSalirFun);
        CuadroSalirFun.setLayout(CuadroSalirFunLayout);
        CuadroSalirFunLayout.setHorizontalGroup(
            CuadroSalirFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirFunLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(TxtSalirFun, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        CuadroSalirFunLayout.setVerticalGroup(
            CuadroSalirFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirFunLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(TxtSalirFun)
                .addContainerGap())
        );

        javax.swing.GroupLayout TituloFuncionLayout = new javax.swing.GroupLayout(TituloFuncion);
        TituloFuncion.setLayout(TituloFuncionLayout);
        TituloFuncionLayout.setHorizontalGroup(
            TituloFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloFuncionLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(TituloComoFunciona1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TituloFuncionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CuadroSalirFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TituloFuncionLayout.setVerticalGroup(
            TituloFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloFuncionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(TituloComoFunciona1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 422, Short.MAX_VALUE)
                .addComponent(CuadroSalirFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelFuncionLayout = new javax.swing.GroupLayout(PanelFuncion);
        PanelFuncion.setLayout(PanelFuncionLayout);
        PanelFuncionLayout.setHorizontalGroup(
            PanelFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFuncionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TituloFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelFuncionLayout.setVerticalGroup(
            PanelFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFuncionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TituloFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TablaOpciones.addTab("tab2", PanelFuncion);

        PanelAlumnos.setBackground(new java.awt.Color(255, 255, 255));

        PanelAlumno.setBackground(new java.awt.Color(255, 255, 255));

        TxtAlumnoPanel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtAlumnoPanel.setText("Alumnos");

        CuadroRNA.setBackground(new java.awt.Color(204, 204, 255));
        CuadroRNA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroRNAMouseMoved(evt);
            }
        });
        CuadroRNA.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroRNAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroRNAMouseExited(evt);
            }
        });

        TxtRegistroAl.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtRegistroAl.setText("Registro Nuevo");

        javax.swing.GroupLayout CuadroRNALayout = new javax.swing.GroupLayout(CuadroRNA);
        CuadroRNA.setLayout(CuadroRNALayout);
        CuadroRNALayout.setHorizontalGroup(
            CuadroRNALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRNALayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(TxtRegistroAl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CuadroRNALayout.setVerticalGroup(
            CuadroRNALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRNALayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TxtRegistroAl)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        CuadroMA.setBackground(new java.awt.Color(204, 204, 255));
        CuadroMA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroMAMouseMoved(evt);
            }
        });
        CuadroMA.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroMAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroMAMouseExited(evt);
            }
        });

        TxtModificacionesAl.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtModificacionesAl.setText("Modificaciones");

        javax.swing.GroupLayout CuadroMALayout = new javax.swing.GroupLayout(CuadroMA);
        CuadroMA.setLayout(CuadroMALayout);
        CuadroMALayout.setHorizontalGroup(
            CuadroMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroMALayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(TxtModificacionesAl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CuadroMALayout.setVerticalGroup(
            CuadroMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroMALayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TxtModificacionesAl)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        CuadroCA.setBackground(new java.awt.Color(204, 204, 255));
        CuadroCA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroCAMouseMoved(evt);
            }
        });
        CuadroCA.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroCAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroCAMouseExited(evt);
            }
        });

        jToggleButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CuadroCALayout = new javax.swing.GroupLayout(CuadroCA);
        CuadroCA.setLayout(CuadroCALayout);
        CuadroCALayout.setHorizontalGroup(
            CuadroCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCALayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        CuadroCALayout.setVerticalGroup(
            CuadroCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        CuadroRIA.setBackground(new java.awt.Color(204, 204, 255));
        CuadroRIA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroRIAMouseMoved(evt);
            }
        });
        CuadroRIA.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroRIAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroRIAMouseExited(evt);
            }
        });

        TxtReporteInfAl.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtReporteInfAl.setText("Reporte de Informacion");

        javax.swing.GroupLayout CuadroRIALayout = new javax.swing.GroupLayout(CuadroRIA);
        CuadroRIA.setLayout(CuadroRIALayout);
        CuadroRIALayout.setHorizontalGroup(
            CuadroRIALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRIALayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(TxtReporteInfAl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CuadroRIALayout.setVerticalGroup(
            CuadroRIALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRIALayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TxtReporteInfAl)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        CuadroSalirAl.setBackground(new java.awt.Color(204, 204, 255));
        CuadroSalirAl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroSalirAlMouseMoved(evt);
            }
        });
        CuadroSalirAl.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroSalirAlMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroSalirAlMouseExited(evt);
            }
        });

        TxtSalirAl.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirAl.setText("Salir");

        javax.swing.GroupLayout CuadroSalirAlLayout = new javax.swing.GroupLayout(CuadroSalirAl);
        CuadroSalirAl.setLayout(CuadroSalirAlLayout);
        CuadroSalirAlLayout.setHorizontalGroup(
            CuadroSalirAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirAlLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(TxtSalirAl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        CuadroSalirAlLayout.setVerticalGroup(
            CuadroSalirAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirAlLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(TxtSalirAl)
                .addContainerGap())
        );

        TxtConsultaAl.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtConsultaAl.setText("Consulta");

        javax.swing.GroupLayout PanelAlumnoLayout = new javax.swing.GroupLayout(PanelAlumno);
        PanelAlumno.setLayout(PanelAlumnoLayout);
        PanelAlumnoLayout.setHorizontalGroup(
            PanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlumnoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAlumnoLayout.createSequentialGroup()
                        .addComponent(TxtAlumnoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelAlumnoLayout.createSequentialGroup()
                        .addGroup(PanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CuadroRNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAlumnoLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(CuadroCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                        .addGroup(PanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CuadroMA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CuadroRIA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(65, 65, 65))))
            .addGroup(PanelAlumnoLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(TxtConsultaAl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAlumnoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CuadroSalirAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelAlumnoLayout.setVerticalGroup(
            PanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlumnoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TxtAlumnoPanel)
                .addGap(33, 33, 33)
                .addGroup(PanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CuadroRNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuadroMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(PanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CuadroRIA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CuadroCA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtConsultaAl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(CuadroSalirAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );

        TablaAlumno.addTab("tab1", PanelAlumno);

        CuadroRNAl.setBackground(new java.awt.Color(255, 255, 255));

        TxtRNAlu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtRNAlu.setText("Registro Nuevo");

        CuadroSalirRNA.setBackground(new java.awt.Color(204, 204, 255));
        CuadroSalirRNA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroSalirRNAMouseMoved(evt);
            }
        });
        CuadroSalirRNA.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroSalirRNAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroSalirRNAMouseExited(evt);
            }
        });

        TxtSalirRNA.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirRNA.setText("Salir");

        javax.swing.GroupLayout CuadroSalirRNALayout = new javax.swing.GroupLayout(CuadroSalirRNA);
        CuadroSalirRNA.setLayout(CuadroSalirRNALayout);
        CuadroSalirRNALayout.setHorizontalGroup(
            CuadroSalirRNALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirRNALayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(TxtSalirRNA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        CuadroSalirRNALayout.setVerticalGroup(
            CuadroSalirRNALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirRNALayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(TxtSalirRNA)
                .addContainerGap())
        );

        TxtNombreRNA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtNombreRNA.setText("Nombre(s):");

        nombre.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                nombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                nombreKeyTyped(evt);
            }
        });

        TxtApellidoPatRNA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtApellidoPatRNA.setText("Apellido Paterno:");

        primerAp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                primerApActionPerformed(evt);
            }
        });
        primerAp.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                primerApKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                primerApKeyTyped(evt);
            }
        });

        TxtApellidoMatRNA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtApellidoMatRNA.setText("Apellido Materno:");

        segundoAp.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                segundoApKeyTyped(evt);
            }
        });

        TxtGeneroA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtGeneroA.setText("Genero:");

        ComboBoxSexoA1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opción", "M", "F" }));
        ComboBoxSexoA1.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                ComboBoxSexoA1ItemStateChanged(evt);
            }
        });
        ComboBoxSexoA1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ComboBoxSexoA1ActionPerformed(evt);
            }
        });

        TxtDesnutricionA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtDesnutricionA.setText("Desnutrición:");

        ComboBoxDesnutricionA1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opcion", "Si", "No" }));
        ComboBoxDesnutricionA1.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                ComboBoxDesnutricionA1ItemStateChanged(evt);
            }
        });

        TxtAlergiasA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtAlergiasA.setText("Alergias:");

        ComboBoxAlergiasA1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opcion", "Si", "No" }));
        ComboBoxAlergiasA1.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                ComboBoxAlergiasA1ItemStateChanged(evt);
            }
        });

        TxtOtraEnfRNA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtOtraEnfRNA.setText("Otra Enfermedad:");

        otrasenfermedades.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                otrasenfermedadesActionPerformed(evt);
            }
        });
        otrasenfermedades.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                otrasenfermedadesKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                otrasenfermedadesKeyTyped(evt);
            }
        });

        TxtMatriculaRNA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtMatriculaRNA.setText("Matricula: ");

        cve.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cveActionPerformed(evt);
            }
        });
        cve.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                cveKeyTyped(evt);
            }
        });

        TxtViveConRNA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtViveConRNA.setText("Vive Con:");

        ComboBoxViveConA1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opción", "1.-Mamá y Papá", "2.-Solo Mamá", "3.-Solo Papá", "4.-Otro" }));
        ComboBoxViveConA1.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                ComboBoxViveConA1ItemStateChanged(evt);
            }
        });

        TxtCarreraRNA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtCarreraRNA.setText("Carrera:");

        ComboBoxCarreraA1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opcion", "1.-Ing. Electronica", "2.-Ing.Electromecánica", "3.-Ing.Gestión empresarial", "4.-Ing. Industrial", "5.-Ing. Logística", "6.-Ing. Mecatrónica", "7.-Ing. Química", "8.-Ing. Sistemas", "9.-Ing.Tics" }));

        BotonAceptarRNA.setText("Aceptar");
        BotonAceptarRNA.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BotonAceptarRNAActionPerformed(evt);
            }
        });

        BotonCancelarAlum.setText("Cancelar");
        BotonCancelarAlum.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BotonCancelarAlumActionPerformed(evt);
            }
        });

        TxtObesidadA1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtObesidadA1.setText("Obesidad:");

        ComboBoxObesidadA1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opcion", "Si", "No" }));
        ComboBoxObesidadA1.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                ComboBoxObesidadA1ItemStateChanged(evt);
            }
        });

        TxtSobrepesoA1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtSobrepesoA1.setText("Sobrepeso:");

        ComboBoxSobrepesoA1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opcion", "Si", "No" }));
        ComboBoxSobrepesoA1.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                ComboBoxSobrepesoA1ItemStateChanged(evt);
            }
        });

        TxtDiabetesA1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtDiabetesA1.setText("Diabetes:");

        ComboBoxDiabetesA1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opcion", "Si", "No" }));

        javax.swing.GroupLayout CuadroRNAlLayout = new javax.swing.GroupLayout(CuadroRNAl);
        CuadroRNAl.setLayout(CuadroRNAlLayout);
        CuadroRNAlLayout.setHorizontalGroup(
            CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRNAlLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRNAlLayout.createSequentialGroup()
                        .addComponent(TxtRNAlu)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRNAlLayout.createSequentialGroup()
                        .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CuadroRNAlLayout.createSequentialGroup()
                                .addComponent(TxtCarreraRNA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxCarreraA1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CuadroRNAlLayout.createSequentialGroup()
                                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtApellidoPatRNA)
                                    .addComponent(TxtApellidoMatRNA, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TxtMatriculaRNA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TxtNombreRNA, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(23, 23, 23)
                                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre)
                                    .addComponent(primerAp)
                                    .addComponent(segundoAp)
                                    .addComponent(cve)))
                            .addGroup(CuadroRNAlLayout.createSequentialGroup()
                                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TxtViveConRNA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CuadroRNAlLayout.createSequentialGroup()
                                        .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtGeneroA, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtAlergiasA, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtDesnutricionA, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtDiabetesA1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtSobrepesoA1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtObesidadA1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(CuadroRNAlLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(BotonAceptarRNA)
                                            .addComponent(TxtOtraEnfRNA))))
                                .addGap(18, 18, 18)
                                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ComboBoxDiabetesA1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(ComboBoxObesidadA1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ComboBoxSobrepesoA1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(otrasenfermedades)
                                                .addComponent(ComboBoxViveConA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(ComboBoxSexoA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(ComboBoxDesnutricionA1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ComboBoxAlergiasA1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRNAlLayout.createSequentialGroup()
                                        .addComponent(BotonCancelarAlum)
                                        .addGap(63, 63, 63)))))
                        .addGap(138, 138, 138)
                        .addComponent(CuadroSalirRNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        CuadroRNAlLayout.setVerticalGroup(
            CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRNAlLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TxtRNAlu)
                .addGap(7, 7, 7)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtMatriculaRNA)
                    .addComponent(cve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNombreRNA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtApellidoPatRNA)
                    .addComponent(primerAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtApellidoMatRNA)
                    .addComponent(segundoAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroRNAlLayout.createSequentialGroup()
                        .addComponent(TxtGeneroA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtDesnutricionA))
                    .addGroup(CuadroRNAlLayout.createSequentialGroup()
                        .addComponent(ComboBoxSexoA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxDesnutricionA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxAlergiasA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtAlergiasA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxObesidadA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtObesidadA1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxSobrepesoA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtSobrepesoA1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxDiabetesA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDiabetesA1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otrasenfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtOtraEnfRNA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxViveConA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtViveConRNA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtCarreraRNA)
                    .addComponent(ComboBoxCarreraA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonAceptarRNA)
                    .addComponent(BotonCancelarAlum)
                    .addComponent(CuadroSalirRNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        TablaAlumno.addTab("tab2", CuadroRNAl);

        CuadroMAlu.setBackground(new java.awt.Color(255, 255, 255));

        TxtMAlu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtMAlu.setText("Modificaciones");

        CuadroSalirMA.setBackground(new java.awt.Color(204, 204, 255));
        CuadroSalirMA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroSalirMAMouseMoved(evt);
            }
        });
        CuadroSalirMA.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroSalirMAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroSalirMAMouseExited(evt);
            }
        });

        TxtModAlu.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtModAlu.setText("Salir");

        javax.swing.GroupLayout CuadroSalirMALayout = new javax.swing.GroupLayout(CuadroSalirMA);
        CuadroSalirMA.setLayout(CuadroSalirMALayout);
        CuadroSalirMALayout.setHorizontalGroup(
            CuadroSalirMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirMALayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(TxtModAlu)
                .addGap(25, 25, 25))
        );
        CuadroSalirMALayout.setVerticalGroup(
            CuadroSalirMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirMALayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(TxtModAlu)
                .addContainerGap())
        );

        javax.swing.GroupLayout CuadroMAluLayout = new javax.swing.GroupLayout(CuadroMAlu);
        CuadroMAlu.setLayout(CuadroMAluLayout);
        CuadroMAluLayout.setHorizontalGroup(
            CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroMAluLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TxtMAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroMAluLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CuadroSalirMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        CuadroMAluLayout.setVerticalGroup(
            CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroMAluLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TxtMAlu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 384, Short.MAX_VALUE)
                .addComponent(CuadroSalirMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        TablaAlumno.addTab("tab3", CuadroMAlu);

        CuadroCAlu.setBackground(new java.awt.Color(255, 255, 255));
        CuadroCAlu.addAncestorListener(new javax.swing.event.AncestorListener()
        {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt)
            {
                CuadroCAluAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt)
            {
                CuadroCAluAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt)
            {
            }
        });

        TxtCAlu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtCAlu.setText("Consulta");

        CuadroSalirCA.setBackground(new java.awt.Color(204, 204, 255));
        CuadroSalirCA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroSalirCAMouseMoved(evt);
            }
        });
        CuadroSalirCA.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroSalirCAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroSalirCAMouseExited(evt);
            }
        });

        TxtSalirCA.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirCA.setText("Salir");

        javax.swing.GroupLayout CuadroSalirCALayout = new javax.swing.GroupLayout(CuadroSalirCA);
        CuadroSalirCA.setLayout(CuadroSalirCALayout);
        CuadroSalirCALayout.setHorizontalGroup(
            CuadroSalirCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirCALayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(TxtSalirCA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        CuadroSalirCALayout.setVerticalGroup(
            CuadroSalirCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirCALayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(TxtSalirCA)
                .addContainerGap())
        );

        javax.swing.GroupLayout CuadroCAluLayout = new javax.swing.GroupLayout(CuadroCAlu);
        CuadroCAlu.setLayout(CuadroCAluLayout);
        CuadroCAluLayout.setHorizontalGroup(
            CuadroCAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCAluLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TxtCAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(CuadroCAluLayout.createSequentialGroup()
                .addGap(493, 493, 493)
                .addComponent(CuadroSalirCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CuadroCAluLayout.setVerticalGroup(
            CuadroCAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCAluLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TxtCAlu)
                .addGap(399, 399, 399)
                .addComponent(CuadroSalirCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TablaAlumno.addTab("Consul", CuadroCAlu);

        CuadroRIAlu.setBackground(new java.awt.Color(255, 255, 255));

        TxtRIAlu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtRIAlu.setText("Reporte de Información");

        CuadroSalirRIA.setBackground(new java.awt.Color(204, 204, 255));
        CuadroSalirRIA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroSalirRIAMouseMoved(evt);
            }
        });
        CuadroSalirRIA.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroSalirRIAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroSalirRIAMouseExited(evt);
            }
        });

        TxtSalirRIA.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirRIA.setText("Salir");

        javax.swing.GroupLayout CuadroSalirRIALayout = new javax.swing.GroupLayout(CuadroSalirRIA);
        CuadroSalirRIA.setLayout(CuadroSalirRIALayout);
        CuadroSalirRIALayout.setHorizontalGroup(
            CuadroSalirRIALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirRIALayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(TxtSalirRIA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        CuadroSalirRIALayout.setVerticalGroup(
            CuadroSalirRIALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirRIALayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(TxtSalirRIA)
                .addContainerGap())
        );

        javax.swing.GroupLayout CuadroRIAluLayout = new javax.swing.GroupLayout(CuadroRIAlu);
        CuadroRIAlu.setLayout(CuadroRIAluLayout);
        CuadroRIAluLayout.setHorizontalGroup(
            CuadroRIAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRIAluLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TxtRIAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRIAluLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CuadroSalirRIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CuadroRIAluLayout.setVerticalGroup(
            CuadroRIAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRIAluLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TxtRIAlu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 389, Short.MAX_VALUE)
                .addComponent(CuadroSalirRIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        TablaAlumno.addTab("tab5", CuadroRIAlu);

        javax.swing.GroupLayout PanelAlumnosLayout = new javax.swing.GroupLayout(PanelAlumnos);
        PanelAlumnos.setLayout(PanelAlumnosLayout);
        PanelAlumnosLayout.setHorizontalGroup(
            PanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlumnosLayout.createSequentialGroup()
                .addComponent(TablaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelAlumnosLayout.setVerticalGroup(
            PanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlumnosLayout.createSequentialGroup()
                .addComponent(TablaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TablaAlumno.getAccessibleContext().setAccessibleName("Consul");

        TablaOpciones.addTab("tab3", PanelAlumnos);

        PanelPersonal.setBackground(new java.awt.Color(255, 255, 255));

        TablaPersonal.setBackground(new java.awt.Color(255, 255, 255));
        TablaPersonal.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                TablaPersonalMouseClicked(evt);
            }
        });

        PanelPersonal2.setBackground(new java.awt.Color(255, 255, 255));

        TxtPersonalPanel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtPersonalPanel.setText("Personal");

        CuadroRNP.setBackground(new java.awt.Color(204, 204, 255));
        CuadroRNP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroRNPMouseMoved(evt);
            }
        });
        CuadroRNP.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroRNPMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroRNPMouseExited(evt);
            }
        });

        TxtRNP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtRNP.setText("Registro Nuevo");

        javax.swing.GroupLayout CuadroRNPLayout = new javax.swing.GroupLayout(CuadroRNP);
        CuadroRNP.setLayout(CuadroRNPLayout);
        CuadroRNPLayout.setHorizontalGroup(
            CuadroRNPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRNPLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(TxtRNP)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        CuadroRNPLayout.setVerticalGroup(
            CuadroRNPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRNPLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TxtRNP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CuadroMP.setBackground(new java.awt.Color(204, 204, 255));
        CuadroMP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroMPMouseMoved(evt);
            }
        });
        CuadroMP.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroMPMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroMPMouseExited(evt);
            }
        });

        TxtMP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtMP.setText("Modificaciones");

        javax.swing.GroupLayout CuadroMPLayout = new javax.swing.GroupLayout(CuadroMP);
        CuadroMP.setLayout(CuadroMPLayout);
        CuadroMPLayout.setHorizontalGroup(
            CuadroMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroMPLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(TxtMP)
                .addGap(26, 26, 26))
        );
        CuadroMPLayout.setVerticalGroup(
            CuadroMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroMPLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(TxtMP)
                .addContainerGap())
        );

        CuadroCP.setBackground(new java.awt.Color(204, 204, 255));
        CuadroCP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroCPMouseMoved(evt);
            }
        });
        CuadroCP.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroCPMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroCPMouseExited(evt);
            }
        });

        TxtCP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtCP.setText("Consulta");

        javax.swing.GroupLayout CuadroCPLayout = new javax.swing.GroupLayout(CuadroCP);
        CuadroCP.setLayout(CuadroCPLayout);
        CuadroCPLayout.setHorizontalGroup(
            CuadroCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroCPLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(TxtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        CuadroCPLayout.setVerticalGroup(
            CuadroCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCPLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TxtCP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CuadroRIP.setBackground(new java.awt.Color(204, 204, 255));
        CuadroRIP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroRIPMouseMoved(evt);
            }
        });
        CuadroRIP.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroRIPMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroRIPMouseExited(evt);
            }
        });

        TxtRIP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtRIP.setText("Reporte de Información");

        javax.swing.GroupLayout CuadroRIPLayout = new javax.swing.GroupLayout(CuadroRIP);
        CuadroRIP.setLayout(CuadroRIPLayout);
        CuadroRIPLayout.setHorizontalGroup(
            CuadroRIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRIPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxtRIP, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        CuadroRIPLayout.setVerticalGroup(
            CuadroRIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRIPLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TxtRIP)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        CuadroSalirP.setBackground(new java.awt.Color(204, 204, 255));
        CuadroSalirP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroSalirPMouseMoved(evt);
            }
        });
        CuadroSalirP.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroSalirPMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroSalirPMouseExited(evt);
            }
        });

        TxtSalirP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirP.setText("Salir");

        javax.swing.GroupLayout CuadroSalirPLayout = new javax.swing.GroupLayout(CuadroSalirP);
        CuadroSalirP.setLayout(CuadroSalirPLayout);
        CuadroSalirPLayout.setHorizontalGroup(
            CuadroSalirPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirPLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(TxtSalirP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        CuadroSalirPLayout.setVerticalGroup(
            CuadroSalirPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirPLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(TxtSalirP)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelPersonal2Layout = new javax.swing.GroupLayout(PanelPersonal2);
        PanelPersonal2.setLayout(PanelPersonal2Layout);
        PanelPersonal2Layout.setHorizontalGroup(
            PanelPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPersonal2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PanelPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CuadroRNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPersonalPanel)
                    .addComponent(CuadroCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(PanelPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CuadroMP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CuadroRIP, javax.swing.GroupLayout.PREFERRED_SIZE, 171, Short.MAX_VALUE))
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPersonal2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CuadroSalirP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        PanelPersonal2Layout.setVerticalGroup(
            PanelPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPersonal2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtPersonalPanel)
                .addGroup(PanelPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPersonal2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(CuadroRNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPersonal2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(CuadroMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(PanelPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CuadroRIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CuadroCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(195, 195, 195)
                .addComponent(CuadroSalirP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        TablaPersonal.addTab("tab1", PanelPersonal2);

        CuadroRNPer.setBackground(new java.awt.Color(255, 255, 255));

        TxtPersonalRN.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtPersonalRN.setText("Registro Nuevo");

        TxtNombreRNP.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtNombreRNP.setText("Nombre(s):");

        TxtApePatRNP.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtApePatRNP.setText("Apellido Paterno:");

        TxtApeMatP.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtApeMatP.setText("Apellido Materno:");

        TxtGeneroRNP.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtGeneroRNP.setText("Genero:");

        TxtDesnutricionRNP.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtDesnutricionRNP.setText("Desnutrición:");

        TxtAlergiasRNP.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtAlergiasRNP.setText("Alergías:");

        TxtOtraEnferRNP.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtOtraEnferRNP.setText("Otra Enfermedad:");

        TxtMatriculaRNP.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtMatriculaRNP.setText("Matricula:");

        TxtViveConRNP.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtViveConRNP.setText("Estatus:");

        BotonAceptarRNP.setText("Aceptar");
        BotonAceptarRNP.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BotonAceptarRNPActionPerformed(evt);
            }
        });

        BotonCancelarPer.setText("Cancelar");
        BotonCancelarPer.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BotonCancelarPerActionPerformed(evt);
            }
        });

        nombrePer.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                nombrePerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                nombrePerKeyTyped(evt);
            }
        });

        primerApPer.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                primerApPerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                primerApPerKeyTyped(evt);
            }
        });

        segundoApPer.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                segundoApPerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                segundoApPerKeyTyped(evt);
            }
        });

        oEnferPer.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                oEnferPerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                oEnferPerKeyTyped(evt);
            }
        });

        cvePer.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                cvePerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                cvePerKeyTyped(evt);
            }
        });

        ComboBoxSexoP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opción", "M", "F" }));
        ComboBoxSexoP1.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                ComboBoxSexoP1ItemStateChanged(evt);
            }
        });
        ComboBoxSexoP1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ComboBoxSexoP1ActionPerformed(evt);
            }
        });

        ComboBoxDesnutricionP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opcion", "Si", "No" }));
        ComboBoxDesnutricionP1.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                ComboBoxDesnutricionP1ItemStateChanged(evt);
            }
        });

        ComboBoxAlergiasP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opcion", "Si", "No" }));
        ComboBoxAlergiasP1.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                ComboBoxAlergiasP1ItemStateChanged(evt);
            }
        });
        ComboBoxAlergiasP1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ComboBoxAlergiasP1ActionPerformed(evt);
            }
        });

        ComboBoxEstatusP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opción", "1.-Base", "2.-Temporal" }));
        ComboBoxEstatusP1.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                ComboBoxEstatusP1ItemStateChanged(evt);
            }
        });

        TxtObesidadA2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtObesidadA2.setText("Obesidad:");

        TxtSobrepesoA2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtSobrepesoA2.setText("Sobrepeso:");

        TxtDiabetesA2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtDiabetesA2.setText("Diabetes:");

        ComboBoxObesidadP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opcion", "Si", "No" }));
        ComboBoxObesidadP1.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                ComboBoxObesidadP1ItemStateChanged(evt);
            }
        });

        ComboBoxSobrepesoP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opcion", "Si", "No" }));
        ComboBoxSobrepesoP1.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                ComboBoxSobrepesoP1ItemStateChanged(evt);
            }
        });

        ComboBoxDiabetesP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opcion", "Si", "No" }));
        ComboBoxDiabetesP1.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                ComboBoxDiabetesP1ItemStateChanged(evt);
            }
        });
        ComboBoxDiabetesP1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ComboBoxDiabetesP1ActionPerformed(evt);
            }
        });

        CuadroSalirRNPer.setBackground(new java.awt.Color(204, 204, 255));
        CuadroSalirRNPer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroSalirRNPerMouseMoved(evt);
            }
        });
        CuadroSalirRNPer.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroSalirRNPerMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroSalirRNPerMouseExited(evt);
            }
        });

        TxtRNPer.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtRNPer.setText("Salir");

        javax.swing.GroupLayout CuadroSalirRNPerLayout = new javax.swing.GroupLayout(CuadroSalirRNPer);
        CuadroSalirRNPer.setLayout(CuadroSalirRNPerLayout);
        CuadroSalirRNPerLayout.setHorizontalGroup(
            CuadroSalirRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirRNPerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxtRNPer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        CuadroSalirRNPerLayout.setVerticalGroup(
            CuadroSalirRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroSalirRNPerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtRNPer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CuadroRNPerLayout = new javax.swing.GroupLayout(CuadroRNPer);
        CuadroRNPer.setLayout(CuadroRNPerLayout);
        CuadroRNPerLayout.setHorizontalGroup(
            CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRNPerLayout.createSequentialGroup()
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtPersonalRN)
                    .addGroup(CuadroRNPerLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNombreRNP)
                            .addComponent(TxtMatriculaRNP)
                            .addComponent(TxtApePatRNP)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRNPerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonAceptarRNP)
                            .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtOtraEnferRNP)
                                .addComponent(TxtGeneroRNP, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtApeMatP)
                                .addComponent(TxtDesnutricionRNP)
                                .addComponent(TxtAlergiasRNP)
                                .addComponent(TxtObesidadA2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtSobrepesoA2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtDiabetesA2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtViveConRNP, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)))
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroRNPerLayout.createSequentialGroup()
                        .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxAlergiasP1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxObesidadP1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxSobrepesoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxDiabetesP1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oEnferPer, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxEstatusP1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(CuadroRNPerLayout.createSequentialGroup()
                        .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cvePer, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombrePer, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(primerApPer, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(segundoApPer, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxSexoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxDesnutricionP1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CuadroRNPerLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(BotonCancelarPer)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(CuadroSalirRNPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        CuadroRNPerLayout.setVerticalGroup(
            CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRNPerLayout.createSequentialGroup()
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroRNPerLayout.createSequentialGroup()
                        .addComponent(TxtPersonalRN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtMatriculaRNP))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRNPerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cvePer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroRNPerLayout.createSequentialGroup()
                        .addComponent(TxtNombreRNP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtApePatRNP))
                    .addGroup(CuadroRNPerLayout.createSequentialGroup()
                        .addComponent(nombrePer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(primerApPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segundoApPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtApeMatP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtGeneroRNP)
                    .addComponent(ComboBoxSexoP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtDesnutricionRNP)
                    .addComponent(ComboBoxDesnutricionP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtAlergiasRNP)
                    .addComponent(ComboBoxAlergiasP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxObesidadP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtObesidadA2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtSobrepesoA2)
                    .addComponent(ComboBoxSobrepesoP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroRNPerLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(ComboBoxDiabetesP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CuadroRNPerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtDiabetesA2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtOtraEnferRNP)
                    .addComponent(oEnferPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtViveConRNP, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxEstatusP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotonAceptarRNP)
                        .addComponent(BotonCancelarPer))
                    .addComponent(CuadroSalirRNPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
        );

        TablaPersonal.addTab("tab2", CuadroRNPer);

        CuadroMPer.setBackground(new java.awt.Color(255, 255, 255));

        TxtMPer.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtMPer.setText("Modificaciones");

        CuadroSalirMPer.setBackground(new java.awt.Color(204, 204, 255));
        CuadroSalirMPer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroSalirMPerMouseMoved(evt);
            }
        });
        CuadroSalirMPer.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroSalirMPerMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroSalirMPerMouseExited(evt);
            }
        });

        TxtSalirMPer.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirMPer.setText("Salir");

        javax.swing.GroupLayout CuadroSalirMPerLayout = new javax.swing.GroupLayout(CuadroSalirMPer);
        CuadroSalirMPer.setLayout(CuadroSalirMPerLayout);
        CuadroSalirMPerLayout.setHorizontalGroup(
            CuadroSalirMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirMPerLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(TxtSalirMPer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        CuadroSalirMPerLayout.setVerticalGroup(
            CuadroSalirMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroSalirMPerLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(TxtSalirMPer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CuadroMPerLayout = new javax.swing.GroupLayout(CuadroMPer);
        CuadroMPer.setLayout(CuadroMPerLayout);
        CuadroMPerLayout.setHorizontalGroup(
            CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroMPerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TxtMPer, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroMPerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CuadroSalirMPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        CuadroMPerLayout.setVerticalGroup(
            CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroMPerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(TxtMPer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 405, Short.MAX_VALUE)
                .addComponent(CuadroSalirMPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        TablaPersonal.addTab("tab3", CuadroMPer);

        CuadroCPer.setBackground(new java.awt.Color(255, 255, 255));

        TxtCPer.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtCPer.setText("Consulta");

        CuadroSalirCPer.setBackground(new java.awt.Color(204, 204, 255));
        CuadroSalirCPer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroSalirCPerMouseMoved(evt);
            }
        });
        CuadroSalirCPer.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroSalirCPerMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroSalirCPerMouseExited(evt);
            }
        });

        TxtSalirCPer.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirCPer.setText("Salir");

        javax.swing.GroupLayout CuadroSalirCPerLayout = new javax.swing.GroupLayout(CuadroSalirCPer);
        CuadroSalirCPer.setLayout(CuadroSalirCPerLayout);
        CuadroSalirCPerLayout.setHorizontalGroup(
            CuadroSalirCPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroSalirCPerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(TxtSalirCPer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        CuadroSalirCPerLayout.setVerticalGroup(
            CuadroSalirCPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroSalirCPerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtSalirCPer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CuadroCPerLayout = new javax.swing.GroupLayout(CuadroCPer);
        CuadroCPer.setLayout(CuadroCPerLayout);
        CuadroCPerLayout.setHorizontalGroup(
            CuadroCPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCPerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(TxtCPer, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(409, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroCPerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CuadroSalirCPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        CuadroCPerLayout.setVerticalGroup(
            CuadroCPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCPerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TxtCPer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 408, Short.MAX_VALUE)
                .addComponent(CuadroSalirCPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        TablaPersonal.addTab("tab4", CuadroCPer);

        CuadroRIPer.setBackground(new java.awt.Color(255, 255, 255));

        TxtRIPer.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtRIPer.setText("Reporte de Información");

        CuadroSalirRIPer.setBackground(new java.awt.Color(204, 204, 255));
        CuadroSalirRIPer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                CuadroSalirRIPerMouseMoved(evt);
            }
        });
        CuadroSalirRIPer.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CuadroSalirRIPerMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                CuadroSalirRIPerMouseExited(evt);
            }
        });

        TxtSalirRIP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirRIP.setText("Salir");

        javax.swing.GroupLayout CuadroSalirRIPerLayout = new javax.swing.GroupLayout(CuadroSalirRIPer);
        CuadroSalirRIPer.setLayout(CuadroSalirRIPerLayout);
        CuadroSalirRIPerLayout.setHorizontalGroup(
            CuadroSalirRIPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirRIPerLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(TxtSalirRIP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        CuadroSalirRIPerLayout.setVerticalGroup(
            CuadroSalirRIPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirRIPerLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(TxtSalirRIP)
                .addContainerGap())
        );

        javax.swing.GroupLayout CuadroRIPerLayout = new javax.swing.GroupLayout(CuadroRIPer);
        CuadroRIPer.setLayout(CuadroRIPerLayout);
        CuadroRIPerLayout.setHorizontalGroup(
            CuadroRIPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRIPerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(TxtRIPer, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRIPerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CuadroSalirRIPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        CuadroRIPerLayout.setVerticalGroup(
            CuadroRIPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRIPerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(TxtRIPer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
                .addComponent(CuadroSalirRIPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        TablaPersonal.addTab("tab5", CuadroRIPer);

        javax.swing.GroupLayout PanelPersonalLayout = new javax.swing.GroupLayout(PanelPersonal);
        PanelPersonal.setLayout(PanelPersonalLayout);
        PanelPersonalLayout.setHorizontalGroup(
            PanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablaPersonal)
        );
        PanelPersonalLayout.setVerticalGroup(
            PanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPersonalLayout.createSequentialGroup()
                .addComponent(TablaPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TablaOpciones.addTab("tab4", PanelPersonal);

        PanelEnfermeria.setBackground(new java.awt.Color(255, 255, 255));

        TituloEnfermeria.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TituloEnfermeria.setText("Enfermeria");

        javax.swing.GroupLayout PanelEnfermeriaLayout = new javax.swing.GroupLayout(PanelEnfermeria);
        PanelEnfermeria.setLayout(PanelEnfermeriaLayout);
        PanelEnfermeriaLayout.setHorizontalGroup(
            PanelEnfermeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEnfermeriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloEnfermeria, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(453, Short.MAX_VALUE))
        );
        PanelEnfermeriaLayout.setVerticalGroup(
            PanelEnfermeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEnfermeriaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(TituloEnfermeria)
                .addContainerGap(459, Short.MAX_VALUE))
        );

        TablaOpciones.addTab("tab5", PanelEnfermeria);

        PanelMenu.add(TablaOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 590, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtInicioMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_TxtInicioMouseClicked
    {//GEN-HEADEREND:event_TxtInicioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtInicioMouseClicked

    private void InicioMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_InicioMouseClicked
    {//GEN-HEADEREND:event_InicioMouseClicked
        TablaOpciones.setSelectedIndex(0);
    }//GEN-LAST:event_InicioMouseClicked

    private void InicioMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_InicioMouseMoved
    {//GEN-HEADEREND:event_InicioMouseMoved
        Inicio.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_InicioMouseMoved

    private void InicioMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_InicioMouseExited
    {//GEN-HEADEREND:event_InicioMouseExited
        Inicio.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_InicioMouseExited

    private void FuncionMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_FuncionMouseClicked
    {//GEN-HEADEREND:event_FuncionMouseClicked
        TablaOpciones.setSelectedIndex(1);
    }//GEN-LAST:event_FuncionMouseClicked

    private void FuncionMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_FuncionMouseMoved
    {//GEN-HEADEREND:event_FuncionMouseMoved
        Funcion.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_FuncionMouseMoved

    private void FuncionMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_FuncionMouseExited
    {//GEN-HEADEREND:event_FuncionMouseExited
        Inicio.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_FuncionMouseExited

    private void AlumnosMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_AlumnosMouseClicked
    {//GEN-HEADEREND:event_AlumnosMouseClicked
        TablaOpciones.setSelectedIndex(2);
    }//GEN-LAST:event_AlumnosMouseClicked

    private void AlumnosMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_AlumnosMouseMoved
    {//GEN-HEADEREND:event_AlumnosMouseMoved
        Alumnos.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_AlumnosMouseMoved

    private void AlumnosMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_AlumnosMouseExited
    {//GEN-HEADEREND:event_AlumnosMouseExited
        Alumnos.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_AlumnosMouseExited

    private void PersonalMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PersonalMouseClicked
    {//GEN-HEADEREND:event_PersonalMouseClicked
        TablaOpciones.setSelectedIndex(3);
    }//GEN-LAST:event_PersonalMouseClicked

    private void PersonalMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PersonalMouseMoved
    {//GEN-HEADEREND:event_PersonalMouseMoved
        Personal.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_PersonalMouseMoved

    private void PersonalMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PersonalMouseExited
    {//GEN-HEADEREND:event_PersonalMouseExited
        Personal.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_PersonalMouseExited

    private void EnfermeriaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_EnfermeriaMouseClicked
    {//GEN-HEADEREND:event_EnfermeriaMouseClicked
        TablaOpciones.setSelectedIndex(4);
    }//GEN-LAST:event_EnfermeriaMouseClicked

    private void EnfermeriaMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_EnfermeriaMouseMoved
    {//GEN-HEADEREND:event_EnfermeriaMouseMoved
        Enfermeria.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_EnfermeriaMouseMoved

    private void EnfermeriaMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_EnfermeriaMouseExited
    {//GEN-HEADEREND:event_EnfermeriaMouseExited
        Enfermeria.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_EnfermeriaMouseExited

    private void PanelVerMasMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMasMouseClicked
    {//GEN-HEADEREND:event_PanelVerMasMouseClicked
        TablaOpciones.setSelectedIndex(1);
    }//GEN-LAST:event_PanelVerMasMouseClicked

    private void PanelVerMasMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMasMouseMoved
    {//GEN-HEADEREND:event_PanelVerMasMouseMoved
        PanelVerMas.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_PanelVerMasMouseMoved

    private void PanelVerMasMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMasMouseExited
    {//GEN-HEADEREND:event_PanelVerMasMouseExited
        PanelVerMas.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_PanelVerMasMouseExited

    private void PanelVerMas2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMas2MouseClicked
    {//GEN-HEADEREND:event_PanelVerMas2MouseClicked
        TablaOpciones.setSelectedIndex(2);
    }//GEN-LAST:event_PanelVerMas2MouseClicked

    private void PanelVerMas2MouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMas2MouseMoved
    {//GEN-HEADEREND:event_PanelVerMas2MouseMoved
        PanelVerMas2.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_PanelVerMas2MouseMoved

    private void PanelVerMas2MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMas2MouseExited
    {//GEN-HEADEREND:event_PanelVerMas2MouseExited
        PanelVerMas2.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_PanelVerMas2MouseExited

    private void PanelVerMas3MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMas3MouseClicked
    {//GEN-HEADEREND:event_PanelVerMas3MouseClicked
        TablaOpciones.setSelectedIndex(3);
    }//GEN-LAST:event_PanelVerMas3MouseClicked

    private void PanelVerMas3MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMas3MouseExited
    {//GEN-HEADEREND:event_PanelVerMas3MouseExited
        PanelVerMas3.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_PanelVerMas3MouseExited

    private void PanelVerMas3MouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMas3MouseMoved
    {//GEN-HEADEREND:event_PanelVerMas3MouseMoved
        PanelVerMas3.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_PanelVerMas3MouseMoved

    private void PanelVerMas4MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMas4MouseClicked
    {//GEN-HEADEREND:event_PanelVerMas4MouseClicked
        TablaOpciones.setSelectedIndex(4);
    }//GEN-LAST:event_PanelVerMas4MouseClicked

    private void PanelVerMas4MouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMas4MouseMoved
    {//GEN-HEADEREND:event_PanelVerMas4MouseMoved
        PanelVerMas4.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_PanelVerMas4MouseMoved

    private void PanelVerMas4MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMas4MouseExited
    {//GEN-HEADEREND:event_PanelVerMas4MouseExited
        PanelVerMas4.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_PanelVerMas4MouseExited

    private void CuadroRNAMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRNAMouseClicked
    {//GEN-HEADEREND:event_CuadroRNAMouseClicked
        TablaAlumno.setSelectedIndex(1);
    }//GEN-LAST:event_CuadroRNAMouseClicked

    private void CuadroRNAMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRNAMouseMoved
    {//GEN-HEADEREND:event_CuadroRNAMouseMoved
        CuadroRNA.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroRNAMouseMoved

    private void CuadroRNAMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRNAMouseExited
    {//GEN-HEADEREND:event_CuadroRNAMouseExited
        CuadroRNA.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroRNAMouseExited

    private void CuadroMAMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroMAMouseClicked
    {//GEN-HEADEREND:event_CuadroMAMouseClicked
        TablaAlumno.setSelectedIndex(2);
    }//GEN-LAST:event_CuadroMAMouseClicked

    private void CuadroMAMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroMAMouseMoved
    {//GEN-HEADEREND:event_CuadroMAMouseMoved
        CuadroMA.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroMAMouseMoved

    private void CuadroMAMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroMAMouseExited
    {//GEN-HEADEREND:event_CuadroMAMouseExited
        CuadroMA.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroMAMouseExited

    private void CuadroCAMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroCAMouseClicked
    {//GEN-HEADEREND:event_CuadroCAMouseClicked
        TablaAlumno.setSelectedIndex(3);


    }//GEN-LAST:event_CuadroCAMouseClicked

    private void CuadroCAMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroCAMouseMoved
    {//GEN-HEADEREND:event_CuadroCAMouseMoved
        CuadroCA.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroCAMouseMoved

    private void CuadroCAMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroCAMouseExited
    {//GEN-HEADEREND:event_CuadroCAMouseExited
        CuadroCA.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroCAMouseExited

    private void CuadroRIAMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRIAMouseClicked
    {//GEN-HEADEREND:event_CuadroRIAMouseClicked
        TablaAlumno.setSelectedIndex(4);
    }//GEN-LAST:event_CuadroRIAMouseClicked

    private void CuadroRIAMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRIAMouseMoved
    {//GEN-HEADEREND:event_CuadroRIAMouseMoved
        CuadroRIA.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroRIAMouseMoved

    private void CuadroRIAMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRIAMouseExited
    {//GEN-HEADEREND:event_CuadroRIAMouseExited
        CuadroRIA.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroRIAMouseExited

    private void CuadroSalirAlMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirAlMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirAlMouseClicked
        TablaOpciones.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirAlMouseClicked

    private void CuadroSalirAlMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirAlMouseExited
    {//GEN-HEADEREND:event_CuadroSalirAlMouseExited
        CuadroSalirAl.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroSalirAlMouseExited

    private void CuadroSalirAlMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirAlMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirAlMouseMoved
        CuadroSalirAl.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroSalirAlMouseMoved

    private void CuadroSalirFunMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirFunMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirFunMouseClicked
        TablaOpciones.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirFunMouseClicked

    private void CuadroSalirFunMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirFunMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirFunMouseMoved
        CuadroSalirFun.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroSalirFunMouseMoved

    private void CuadroSalirFunMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirFunMouseExited
    {//GEN-HEADEREND:event_CuadroSalirFunMouseExited
        CuadroSalirFun.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroSalirFunMouseExited

    private void CuadroSalirRNAMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRNAMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirRNAMouseClicked
        TablaAlumno.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirRNAMouseClicked

    private void CuadroSalirRNAMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRNAMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirRNAMouseMoved
        CuadroSalirRNA.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroSalirRNAMouseMoved

    private void CuadroSalirRNAMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRNAMouseExited
    {//GEN-HEADEREND:event_CuadroSalirRNAMouseExited
        CuadroSalirRNA.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroSalirRNAMouseExited

    private void CuadroSalirMAMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirMAMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirMAMouseClicked
        TablaAlumno.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirMAMouseClicked

    private void CuadroSalirMAMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirMAMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirMAMouseMoved
        CuadroSalirMA.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroSalirMAMouseMoved

    private void CuadroSalirMAMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirMAMouseExited
    {//GEN-HEADEREND:event_CuadroSalirMAMouseExited
        CuadroSalirMA.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroSalirMAMouseExited

    private void CuadroSalirCAMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirCAMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirCAMouseClicked
        TablaAlumno.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirCAMouseClicked

    private void CuadroSalirCAMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirCAMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirCAMouseMoved
        CuadroSalirCA.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroSalirCAMouseMoved

    private void CuadroSalirCAMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirCAMouseExited
    {//GEN-HEADEREND:event_CuadroSalirCAMouseExited
        CuadroSalirCA.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroSalirCAMouseExited

    private void CuadroSalirRIAMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRIAMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirRIAMouseClicked
        TablaAlumno.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirRIAMouseClicked

    private void CuadroSalirRIAMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRIAMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirRIAMouseMoved
        CuadroSalirRIA.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroSalirRIAMouseMoved

    private void CuadroSalirRIAMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRIAMouseExited
    {//GEN-HEADEREND:event_CuadroSalirRIAMouseExited
        CuadroSalirRIA.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroSalirRIAMouseExited

    private void CuadroRNPMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRNPMouseClicked
    {//GEN-HEADEREND:event_CuadroRNPMouseClicked
        TablaPersonal.setSelectedIndex(1);
    }//GEN-LAST:event_CuadroRNPMouseClicked

    private void CuadroRNPMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRNPMouseMoved
    {//GEN-HEADEREND:event_CuadroRNPMouseMoved
        CuadroRNP.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroRNPMouseMoved

    private void CuadroRNPMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRNPMouseExited
    {//GEN-HEADEREND:event_CuadroRNPMouseExited
        CuadroRNP.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroRNPMouseExited

    private void CuadroMPMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroMPMouseClicked
    {//GEN-HEADEREND:event_CuadroMPMouseClicked
        TablaPersonal.setSelectedIndex(2);
    }//GEN-LAST:event_CuadroMPMouseClicked

    private void CuadroMPMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroMPMouseMoved
    {//GEN-HEADEREND:event_CuadroMPMouseMoved
        CuadroMP.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroMPMouseMoved

    private void CuadroMPMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroMPMouseExited
    {//GEN-HEADEREND:event_CuadroMPMouseExited
        CuadroMP.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroMPMouseExited

    private void CuadroCPMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroCPMouseClicked
    {//GEN-HEADEREND:event_CuadroCPMouseClicked
        TablaPersonal.setSelectedIndex(3);
    }//GEN-LAST:event_CuadroCPMouseClicked

    private void CuadroCPMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroCPMouseMoved
    {//GEN-HEADEREND:event_CuadroCPMouseMoved
        CuadroCP.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroCPMouseMoved

    private void CuadroCPMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroCPMouseExited
    {//GEN-HEADEREND:event_CuadroCPMouseExited
        CuadroCP.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroCPMouseExited

    private void CuadroRIPMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRIPMouseClicked
    {//GEN-HEADEREND:event_CuadroRIPMouseClicked
        TablaPersonal.setSelectedIndex(4);
    }//GEN-LAST:event_CuadroRIPMouseClicked

    private void CuadroRIPMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRIPMouseMoved
    {//GEN-HEADEREND:event_CuadroRIPMouseMoved
        CuadroRIP.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroRIPMouseMoved

    private void CuadroRIPMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRIPMouseExited
    {//GEN-HEADEREND:event_CuadroRIPMouseExited
        CuadroRIP.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroRIPMouseExited

    private void CuadroSalirPMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirPMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirPMouseClicked
        TablaOpciones.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirPMouseClicked

    private void CuadroSalirPMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirPMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirPMouseMoved
        CuadroSalirP.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroSalirPMouseMoved

    private void CuadroSalirPMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirPMouseExited
    {//GEN-HEADEREND:event_CuadroSalirPMouseExited
        CuadroSalirP.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroSalirPMouseExited

    private void CuadroSalirMPerMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirMPerMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirMPerMouseClicked
        TablaPersonal.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirMPerMouseClicked

    private void TablaPersonalMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_TablaPersonalMouseClicked
    {//GEN-HEADEREND:event_TablaPersonalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaPersonalMouseClicked

    private void CuadroSalirMPerMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirMPerMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirMPerMouseMoved
        CuadroSalirMPer.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroSalirMPerMouseMoved

    private void CuadroSalirMPerMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirMPerMouseExited
    {//GEN-HEADEREND:event_CuadroSalirMPerMouseExited
        CuadroSalirMPer.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroSalirMPerMouseExited

    private void CuadroSalirCPerMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirCPerMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirCPerMouseClicked
        TablaPersonal.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirCPerMouseClicked

    private void CuadroSalirCPerMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirCPerMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirCPerMouseMoved
        CuadroSalirCPer.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroSalirCPerMouseMoved

    private void CuadroSalirCPerMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirCPerMouseExited
    {//GEN-HEADEREND:event_CuadroSalirCPerMouseExited
        CuadroSalirCPer.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroSalirCPerMouseExited

    private void CuadroSalirRIPerMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRIPerMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirRIPerMouseClicked
        TablaPersonal.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirRIPerMouseClicked

    private void CuadroSalirRIPerMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRIPerMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirRIPerMouseMoved
        CuadroSalirRIPer.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroSalirRIPerMouseMoved

    private void CuadroSalirRIPerMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRIPerMouseExited
    {//GEN-HEADEREND:event_CuadroSalirRIPerMouseExited
        CuadroSalirRIPer.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroSalirRIPerMouseExited

    private void nombreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nombreActionPerformed
    {//GEN-HEADEREND:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void primerApActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_primerApActionPerformed
    {//GEN-HEADEREND:event_primerApActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primerApActionPerformed

    private void otrasenfermedadesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_otrasenfermedadesActionPerformed
    {//GEN-HEADEREND:event_otrasenfermedadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otrasenfermedadesActionPerformed

    private void cveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cveActionPerformed
    {//GEN-HEADEREND:event_cveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cveActionPerformed

    private void BotonAceptarRNAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BotonAceptarRNAActionPerformed
    {//GEN-HEADEREND:event_BotonAceptarRNAActionPerformed
 try
        {
            if (Menu.buscar(menu.a, cve.getText()) == -1)
            {
                String carrera = (String) ComboBoxCarreraA1.getSelectedItem();
                char f = carrera.charAt(0);
                String vive = (String) ComboBoxViveConA1.getSelectedItem();
                char g = vive.charAt(0);
                menu.a = Menu.inserta(menu.a, new Alumnos(
                        Character.getNumericValue(f),
                        Character.getNumericValue(g),
                        cve.getText(),
                        nombre.getText(),
                        primerAp.getText(),
                        segundoAp.getText(),
                        ((String) ComboBoxSexoA1.getSelectedItem()).charAt(0),
                        convertirStringABoolean((String) ComboBoxDesnutricionA1.getSelectedItem()),
                        convertirStringABoolean((String) ComboBoxSobrepesoA1.getSelectedItem()),
                        convertirStringABoolean((String) ComboBoxAlergiasA1.getSelectedItem()),
                        convertirStringABoolean((String) ComboBoxObesidadA1.getSelectedItem()),
                        convertirStringABoolean((String) ComboBoxDiabetesA1.getSelectedItem()),
                        otrasenfermedades.getText()
                ));
                Mensajes.exito(this, "Alumno registrado");
            } else
            {
                Mensajes.error(this, "Alumno existente");
            }
            BotonCancelarAlumActionPerformed(evt);

        } catch (NumberFormatException e)
        {
            Mensajes.error(this, "Error de formato: Ingresa un número válido." + e.getMessage());
        } catch (Exception a)
        {
            Mensajes.error(this, " excepción específica: " + a.getMessage());
        }

    
       

    }//GEN-LAST:event_BotonAceptarRNAActionPerformed

    private void ComboBoxSexoA1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBoxSexoA1ActionPerformed
    {//GEN-HEADEREND:event_ComboBoxSexoA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSexoA1ActionPerformed

    private void ComboBoxSexoA1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxSexoA1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxSexoA1ItemStateChanged
        CtrlInterfaz.cambia(ComboBoxDesnutricionA1);
    }//GEN-LAST:event_ComboBoxSexoA1ItemStateChanged

    private void ComboBoxDesnutricionA1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxDesnutricionA1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxDesnutricionA1ItemStateChanged
        CtrlInterfaz.cambia(ComboBoxAlergiasA1);
    }//GEN-LAST:event_ComboBoxDesnutricionA1ItemStateChanged

    private void ComboBoxAlergiasA1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxAlergiasA1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxAlergiasA1ItemStateChanged
        CtrlInterfaz.cambia(ComboBoxObesidadA1);
    }//GEN-LAST:event_ComboBoxAlergiasA1ItemStateChanged

    private void ComboBoxObesidadA1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxObesidadA1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxObesidadA1ItemStateChanged
        CtrlInterfaz.cambia(ComboBoxSobrepesoA1);
    }//GEN-LAST:event_ComboBoxObesidadA1ItemStateChanged

    private void ComboBoxSobrepesoA1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxSobrepesoA1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxSobrepesoA1ItemStateChanged
        CtrlInterfaz.cambia(ComboBoxDiabetesA1);
    }//GEN-LAST:event_ComboBoxSobrepesoA1ItemStateChanged

    private void ComboBoxViveConA1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxViveConA1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxViveConA1ItemStateChanged
        CtrlInterfaz.cambia(ComboBoxCarreraA1);
    }//GEN-LAST:event_ComboBoxViveConA1ItemStateChanged

    private void CuadroCAluAncestorMoved(javax.swing.event.AncestorEvent evt)//GEN-FIRST:event_CuadroCAluAncestorMoved
    {//GEN-HEADEREND:event_CuadroCAluAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadroCAluAncestorMoved

    private void CuadroCAluAncestorAdded(javax.swing.event.AncestorEvent evt)//GEN-FIRST:event_CuadroCAluAncestorAdded
    {//GEN-HEADEREND:event_CuadroCAluAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadroCAluAncestorAdded

    private void BotonCancelarPerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BotonCancelarPerActionPerformed
    {//GEN-HEADEREND:event_BotonCancelarPerActionPerformed
 CtrlInterfaz.limpia(nombrePer,primerApPer,segundoApPer,cvePer);
        CtrlInterfaz.habilita(false, nombrePer,primerApPer,segundoApPer
        ,ComboBoxSexoP1,ComboBoxDesnutricionP1,ComboBoxAlergiasP1,ComboBoxObesidadP1,
        ComboBoxSobrepesoP1,ComboBoxDiabetesP1,oEnferPer,ComboBoxEstatusP1);
        CtrlInterfaz.cambia(cvePer);       
    }//GEN-LAST:event_BotonCancelarPerActionPerformed

    private void BotonAceptarRNPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BotonAceptarRNPActionPerformed
    {//GEN-HEADEREND:event_BotonAceptarRNPActionPerformed
        try
        {
            if (Menu.buscar(menu.a, cvePer.getText())==-1)
            {
                menu.a= Menu.inserta(menu.a, new Personal(( (String)ComboBoxEstatusP1.getSelectedItem()).charAt(4), cvePer.getText(), 
                        nombrePer.getText(), primerApPer.getText(), segundoApPer.getText(), 
                         ((String) ComboBoxSexoP1.getSelectedItem()).charAt(0),
                        convertirStringABoolean((String) ComboBoxDesnutricionP1.getSelectedItem()),
                        convertirStringABoolean((String) ComboBoxAlergiasP1.getSelectedItem()),
                        convertirStringABoolean((String) ComboBoxObesidadP1.getSelectedItem()),
                        convertirStringABoolean((String) ComboBoxSobrepesoP1.getSelectedItem()),
                        convertirStringABoolean((String) ComboBoxDiabetesP1.getSelectedItem()), 
                        oEnferPer.getText()));
                Mensajes.exito(this, "Personal Registardo");
                
                
            } else
            {
                Mensajes.error(this, "Personal Existente");
            }
             BotonCancelarPerActionPerformed(evt);
        } catch (NumberFormatException e)
        {
            Mensajes.error(this, "Error de formato: Ingresa un número válido." + e.getMessage());
        } catch (Exception a)
        {
            Mensajes.error(this, " excepción específica: " + a.getMessage());
        }

    }//GEN-LAST:event_BotonAceptarRNPActionPerformed

    private void CuadroSalirRNPerMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRNPerMouseExited
    {//GEN-HEADEREND:event_CuadroSalirRNPerMouseExited
        CuadroSalirRNPer.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_CuadroSalirRNPerMouseExited

    private void CuadroSalirRNPerMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRNPerMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirRNPerMouseClicked
        TablaPersonal.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirRNPerMouseClicked

    private void CuadroSalirRNPerMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRNPerMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirRNPerMouseMoved
        CuadroSalirRNPer.setBackground(new Color(0, 8, 84));
    }//GEN-LAST:event_CuadroSalirRNPerMouseMoved

    private void ComboBoxSexoP1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxSexoP1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxSexoP1ItemStateChanged
       CtrlInterfaz.cambia(ComboBoxDesnutricionP1);
    }//GEN-LAST:event_ComboBoxSexoP1ItemStateChanged

    private void ComboBoxSexoP1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBoxSexoP1ActionPerformed
    {//GEN-HEADEREND:event_ComboBoxSexoP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSexoP1ActionPerformed

    private void ComboBoxDesnutricionP1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxDesnutricionP1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxDesnutricionP1ItemStateChanged
      CtrlInterfaz.cambia(ComboBoxAlergiasP1);
    }//GEN-LAST:event_ComboBoxDesnutricionP1ItemStateChanged

    private void ComboBoxAlergiasP1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxAlergiasP1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxAlergiasP1ItemStateChanged
        CtrlInterfaz.cambia(ComboBoxObesidadP1);
    }//GEN-LAST:event_ComboBoxAlergiasP1ItemStateChanged

    private void ComboBoxEstatusP1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxEstatusP1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxEstatusP1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxEstatusP1ItemStateChanged

    private void ComboBoxObesidadP1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxObesidadP1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxObesidadP1ItemStateChanged
        CtrlInterfaz.cambia(ComboBoxSobrepesoP1);
    }//GEN-LAST:event_ComboBoxObesidadP1ItemStateChanged

    private void ComboBoxSobrepesoP1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxSobrepesoP1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxSobrepesoP1ItemStateChanged
       CtrlInterfaz.cambia(ComboBoxDiabetesP1);
    }//GEN-LAST:event_ComboBoxSobrepesoP1ItemStateChanged

    private void ComboBoxDiabetesP1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxDiabetesP1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxDiabetesP1ItemStateChanged
       CtrlInterfaz.cambia(oEnferPer);
    }//GEN-LAST:event_ComboBoxDiabetesP1ItemStateChanged

    private void BotonCancelarAlumActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BotonCancelarAlumActionPerformed
    {//GEN-HEADEREND:event_BotonCancelarAlumActionPerformed
      CtrlInterfaz.limpia(nombre,primerAp,segundoAp,ComboBoxSexoA1,ComboBoxDesnutricionA1
      ,ComboBoxAlergiasA1,ComboBoxSobrepesoA1,ComboBoxDiabetesA1,
      otrasenfermedades,ComboBoxViveConA1,ComboBoxCarreraA1,cve);
        CtrlInterfaz.habilita(false, cve,nombre,primerAp,segundoAp,ComboBoxSexoA1,ComboBoxDesnutricionA1
      ,ComboBoxAlergiasA1,ComboBoxSobrepesoA1,ComboBoxDiabetesA1,
      otrasenfermedades,ComboBoxViveConA1,ComboBoxCarreraA1,BotonAceptarRNA);
        CtrlInterfaz.cambia(nombre);
    }//GEN-LAST:event_BotonCancelarAlumActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nombreKeyTyped
    {//GEN-HEADEREND:event_nombreKeyTyped
       Validaciones.validaAlfabeticos(evt, 15, nombre.getText());
    }//GEN-LAST:event_nombreKeyTyped

    private void nombreKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nombreKeyPressed
    {//GEN-HEADEREND:event_nombreKeyPressed
       Validaciones.enterCadenaNoVacia(this, evt, nombre, primerAp);
    }//GEN-LAST:event_nombreKeyPressed

    private void primerApKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_primerApKeyPressed
    {//GEN-HEADEREND:event_primerApKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, primerAp, segundoAp);
    }//GEN-LAST:event_primerApKeyPressed

    private void otrasenfermedadesKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_otrasenfermedadesKeyPressed
    {//GEN-HEADEREND:event_otrasenfermedadesKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, otrasenfermedades, cve);
    }//GEN-LAST:event_otrasenfermedadesKeyPressed

    private void nombrePerKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nombrePerKeyPressed
    {//GEN-HEADEREND:event_nombrePerKeyPressed
       Validaciones.enterCadenaNoVacia(this, evt, nombrePer, primerApPer);
    }//GEN-LAST:event_nombrePerKeyPressed

    private void primerApPerKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_primerApPerKeyPressed
    {//GEN-HEADEREND:event_primerApPerKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, primerApPer, segundoApPer);
    }//GEN-LAST:event_primerApPerKeyPressed

    private void segundoApPerKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_segundoApPerKeyPressed
    {//GEN-HEADEREND:event_segundoApPerKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, segundoApPer, oEnferPer);
    }//GEN-LAST:event_segundoApPerKeyPressed

    private void oEnferPerKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_oEnferPerKeyPressed
    {//GEN-HEADEREND:event_oEnferPerKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, oEnferPer, cvePer);
    }//GEN-LAST:event_oEnferPerKeyPressed

    private void ComboBoxDiabetesP1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBoxDiabetesP1ActionPerformed
    {//GEN-HEADEREND:event_ComboBoxDiabetesP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxDiabetesP1ActionPerformed

    private void ComboBoxAlergiasP1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBoxAlergiasP1ActionPerformed
    {//GEN-HEADEREND:event_ComboBoxAlergiasP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxAlergiasP1ActionPerformed

    private void cvePerKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cvePerKeyPressed
    {//GEN-HEADEREND:event_cvePerKeyPressed
        if (evt.getKeyChar()== '\n')
        {
            if (Menu.buscar(menu.a, cvePer.getText())==-1)
            {
                Mensajes.error(this, "Matricula Existente");
                BotonCancelarPerActionPerformed(null);
            } 
            }
        Validaciones.enterCadenaNoVacia(this, evt, cvePer, nombrePer);
        
    }//GEN-LAST:event_cvePerKeyPressed

    private void cvePerKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cvePerKeyTyped
    {//GEN-HEADEREND:event_cvePerKeyTyped
        Validaciones.validaAlfabeticos(evt, 8, cvePer.getText());
    }//GEN-LAST:event_cvePerKeyTyped

    private void nombrePerKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nombrePerKeyTyped
    {//GEN-HEADEREND:event_nombrePerKeyTyped
       Validaciones.validaAlfabeticos(evt, 15, nombrePer.getText());
    }//GEN-LAST:event_nombrePerKeyTyped

    private void primerApPerKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_primerApPerKeyTyped
    {//GEN-HEADEREND:event_primerApPerKeyTyped
      Validaciones.validaAlfabeticos(evt, 15, primerApPer.getText());
    }//GEN-LAST:event_primerApPerKeyTyped

    private void segundoApPerKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_segundoApPerKeyTyped
    {//GEN-HEADEREND:event_segundoApPerKeyTyped
       Validaciones.validaAlfabeticos(evt, 15, segundoApPer.getText());
    }//GEN-LAST:event_segundoApPerKeyTyped

    private void oEnferPerKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_oEnferPerKeyTyped
    {//GEN-HEADEREND:event_oEnferPerKeyTyped
       Validaciones.validaAlfabeticos(evt, 15, oEnferPer.getText());
    }//GEN-LAST:event_oEnferPerKeyTyped

    private void primerApKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_primerApKeyTyped
    {//GEN-HEADEREND:event_primerApKeyTyped
       Validaciones.validaAlfabeticos(evt, 15, primerAp.getText());
    }//GEN-LAST:event_primerApKeyTyped

    private void segundoApKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_segundoApKeyTyped
    {//GEN-HEADEREND:event_segundoApKeyTyped
       Validaciones.validaAlfabeticos(evt, 15, segundoAp.getText());
    }//GEN-LAST:event_segundoApKeyTyped

    private void otrasenfermedadesKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_otrasenfermedadesKeyTyped
    {//GEN-HEADEREND:event_otrasenfermedadesKeyTyped
       Validaciones.validaAlfabeticos(evt, 15, otrasenfermedades.getText());
    }//GEN-LAST:event_otrasenfermedadesKeyTyped

    private void cveKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cveKeyTyped
    {//GEN-HEADEREND:event_cveKeyTyped
       Validaciones.validaAlfabeticos(evt, 15, cve.getText());
    }//GEN-LAST:event_cveKeyTyped

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jToggleButton1ActionPerformed
    {//GEN-HEADEREND:event_jToggleButton1ActionPerformed
      ca q = new ca();
      q.setVisible(true);
      q.setUndecorated(true);
      q.setLocation(null);
       
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void CierreCompletoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CierreCompletoMouseClicked
    {//GEN-HEADEREND:event_CierreCompletoMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CierreCompletoMouseClicked

    private void CierreCompletoMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CierreCompletoMouseEntered
    {//GEN-HEADEREND:event_CierreCompletoMouseEntered
        CierreCompleto.setBackground(Color.red);
    }//GEN-LAST:event_CierreCompletoMouseEntered

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanel1MousePressed
    {//GEN-HEADEREND:event_jPanel1MousePressed
        xMouse= evt.getX();
        yMouse= evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanel1MouseDragged
    {//GEN-HEADEREND:event_jPanel1MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged
   
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Alumnos;
    private javax.swing.JLabel Bienvenidos;
    private javax.swing.JButton BotonAceptarRNA;
    private javax.swing.JButton BotonAceptarRNP;
    private javax.swing.JButton BotonCancelarAlum;
    private javax.swing.JButton BotonCancelarPer;
    private javax.swing.JLabel CierreCompleto;
    private javax.swing.JComboBox<String> ComboBoxAlergiasA1;
    private javax.swing.JComboBox<String> ComboBoxAlergiasP1;
    private javax.swing.JComboBox<String> ComboBoxCarreraA1;
    private javax.swing.JComboBox<String> ComboBoxDesnutricionA1;
    private javax.swing.JComboBox<String> ComboBoxDesnutricionP1;
    private javax.swing.JComboBox<String> ComboBoxDiabetesA1;
    private javax.swing.JComboBox<String> ComboBoxDiabetesP1;
    private javax.swing.JComboBox<String> ComboBoxEstatusP1;
    private javax.swing.JComboBox<String> ComboBoxObesidadA1;
    private javax.swing.JComboBox<String> ComboBoxObesidadP1;
    private javax.swing.JComboBox<String> ComboBoxSexoA1;
    private javax.swing.JComboBox<String> ComboBoxSexoP1;
    private javax.swing.JComboBox<String> ComboBoxSobrepesoA1;
    private javax.swing.JComboBox<String> ComboBoxSobrepesoP1;
    private javax.swing.JComboBox<String> ComboBoxViveConA1;
    private javax.swing.JPanel CuadroAlumnos;
    private javax.swing.JPanel CuadroCA;
    private javax.swing.JPanel CuadroCAlu;
    private javax.swing.JPanel CuadroCP;
    private javax.swing.JPanel CuadroCPer;
    private javax.swing.JPanel CuadroFuncion;
    private javax.swing.JPanel CuadroMA;
    private javax.swing.JPanel CuadroMAlu;
    private javax.swing.JPanel CuadroMP;
    private javax.swing.JPanel CuadroMPer;
    private javax.swing.JPanel CuadroPersonal;
    private javax.swing.JPanel CuadroRIA;
    private javax.swing.JPanel CuadroRIAlu;
    private javax.swing.JPanel CuadroRIP;
    private javax.swing.JPanel CuadroRIPer;
    private javax.swing.JPanel CuadroRNA;
    private javax.swing.JPanel CuadroRNAl;
    private javax.swing.JPanel CuadroRNP;
    private javax.swing.JPanel CuadroRNPer;
    private javax.swing.JPanel CuadroSalirAl;
    private javax.swing.JPanel CuadroSalirCA;
    private javax.swing.JPanel CuadroSalirCPer;
    private javax.swing.JPanel CuadroSalirFun;
    private javax.swing.JPanel CuadroSalirMA;
    private javax.swing.JPanel CuadroSalirMPer;
    private javax.swing.JPanel CuadroSalirP;
    private javax.swing.JPanel CuadroSalirRIA;
    private javax.swing.JPanel CuadroSalirRIPer;
    private javax.swing.JPanel CuadroSalirRNA;
    private javax.swing.JPanel CuadroSalirRNPer;
    private javax.swing.JPanel CuadrosEnfermeria;
    private javax.swing.JPanel Enfermeria;
    private javax.swing.JPanel Funcion;
    private javax.swing.JPanel Inicio;
    private javax.swing.JPanel PanelAlumno;
    private javax.swing.JPanel PanelAlumnos;
    private javax.swing.JPanel PanelEnfermeria;
    private javax.swing.JPanel PanelFuncion;
    private javax.swing.JPanel PanelInicio;
    private javax.swing.JPanel PanelIzq;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelPersonal;
    private javax.swing.JPanel PanelPersonal2;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JPanel PanelVerMas;
    private javax.swing.JPanel PanelVerMas2;
    private javax.swing.JPanel PanelVerMas3;
    private javax.swing.JPanel PanelVerMas4;
    private javax.swing.JPanel Personal;
    private javax.swing.JTabbedPane TablaAlumno;
    private javax.swing.JTabbedPane TablaOpciones;
    private javax.swing.JTabbedPane TablaPersonal;
    private javax.swing.JLabel TextoUNIVERSIDAD;
    private javax.swing.JLabel TituloComoFunciona1;
    private javax.swing.JLabel TituloEnfermeria;
    private javax.swing.JPanel TituloFuncion;
    private javax.swing.JLabel TxtAlergiasA;
    private javax.swing.JLabel TxtAlergiasRNP;
    private javax.swing.JLabel TxtAlumnoPanel;
    private javax.swing.JLabel TxtAlumnos;
    private javax.swing.JLabel TxtAlumnos2;
    private javax.swing.JLabel TxtApeMatP;
    private javax.swing.JLabel TxtApePatRNP;
    private javax.swing.JLabel TxtApellidoMatRNA;
    private javax.swing.JLabel TxtApellidoPatRNA;
    private javax.swing.JLabel TxtCAlu;
    private javax.swing.JLabel TxtCP;
    private javax.swing.JLabel TxtCPer;
    private javax.swing.JLabel TxtCarreraRNA;
    private javax.swing.JLabel TxtConsultaAl;
    private javax.swing.JLabel TxtDesnutricionA;
    private javax.swing.JLabel TxtDesnutricionRNP;
    private javax.swing.JLabel TxtDiabetesA1;
    private javax.swing.JLabel TxtDiabetesA2;
    private javax.swing.JLabel TxtEnfermeria;
    private javax.swing.JLabel TxtEnfermeria2;
    private javax.swing.JLabel TxtFuncion;
    private javax.swing.JLabel TxtFuncion2;
    private javax.swing.JLabel TxtGeneroA;
    private javax.swing.JLabel TxtGeneroRNP;
    private javax.swing.JLabel TxtInicio;
    private javax.swing.JLabel TxtInicio2;
    private javax.swing.JLabel TxtMAlu;
    private javax.swing.JLabel TxtMP;
    private javax.swing.JLabel TxtMPer;
    private javax.swing.JLabel TxtMatriculaRNA;
    private javax.swing.JLabel TxtMatriculaRNP;
    private javax.swing.JLabel TxtModAlu;
    private javax.swing.JLabel TxtModificacionesAl;
    private javax.swing.JLabel TxtNombreRNA;
    private javax.swing.JLabel TxtNombreRNP;
    private javax.swing.JLabel TxtObesidadA1;
    private javax.swing.JLabel TxtObesidadA2;
    private javax.swing.JLabel TxtOtraEnfRNA;
    private javax.swing.JLabel TxtOtraEnferRNP;
    private javax.swing.JLabel TxtPersonal;
    private javax.swing.JLabel TxtPersonal2;
    private javax.swing.JLabel TxtPersonalPanel;
    private javax.swing.JLabel TxtPersonalRN;
    private javax.swing.JLabel TxtRIAlu;
    private javax.swing.JLabel TxtRIP;
    private javax.swing.JLabel TxtRIPer;
    private javax.swing.JLabel TxtRNAlu;
    private javax.swing.JLabel TxtRNP;
    private javax.swing.JLabel TxtRNPer;
    private javax.swing.JLabel TxtRegistroAl;
    private javax.swing.JLabel TxtReporteInfAl;
    private javax.swing.JLabel TxtSalirAl;
    private javax.swing.JLabel TxtSalirCA;
    private javax.swing.JLabel TxtSalirCPer;
    private javax.swing.JLabel TxtSalirFun;
    private javax.swing.JLabel TxtSalirMPer;
    private javax.swing.JLabel TxtSalirP;
    private javax.swing.JLabel TxtSalirRIA;
    private javax.swing.JLabel TxtSalirRIP;
    private javax.swing.JLabel TxtSalirRNA;
    private javax.swing.JLabel TxtSobrepesoA1;
    private javax.swing.JLabel TxtSobrepesoA2;
    private javax.swing.JLabel TxtViveConRNA;
    private javax.swing.JLabel TxtViveConRNP;
    private javax.swing.JLabel VerMas1;
    private javax.swing.JLabel VerMas2;
    private javax.swing.JLabel VerMas3;
    private javax.swing.JLabel VerMas4;
    private javax.swing.JTextField cve;
    private javax.swing.JTextField cvePer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombrePer;
    private javax.swing.JTextField oEnferPer;
    private javax.swing.JTextField otrasenfermedades;
    private javax.swing.JTextField primerAp;
    private javax.swing.JTextField primerApPer;
    private javax.swing.JTextField segundoAp;
    private javax.swing.JTextField segundoApPer;
    // End of variables declaration//GEN-END:variables
}
