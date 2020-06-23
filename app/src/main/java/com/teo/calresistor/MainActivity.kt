package com.teo.calresistor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ban1:String ="1"
        var ban2:String ="0"
        var punto:String=""
        var ban3:String =" Ω"
        var tol:String = tv2_4.text.toString()


        var valor:String=""

        //banda1
        //tv1_1.setOnClickListener { ban1= tv1_1.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda1.background = tv1_1.background }
        tv2_1.setOnClickListener { ban1= tv2_1.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda1.background = tv2_1.background }
        tv3_1.setOnClickListener { ban1= tv3_1.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda1.background = tv3_1.background }
        tv4_1.setOnClickListener { ban1= tv4_1.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda1.background = tv4_1.background  }
        tv5_1.setOnClickListener { ban1= tv5_1.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda1.background = tv5_1.background  }
        tv6_1.setOnClickListener { ban1= tv6_1.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda1.background = tv6_1.background  }
        tv7_1.setOnClickListener { ban1= tv7_1.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda1.background = tv7_1.background  }
        tv8_1.setOnClickListener { ban1= tv8_1.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda1.background = tv8_1.background  }
        tv9_1.setOnClickListener { ban1= tv9_1.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda1.background = tv9_1.background  }
        tv10_1.setOnClickListener { ban1= tv10_1.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda1.background = tv10_1.background  }
        //banda2
        tv1_2.setOnClickListener { ban2=tv1_2.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda2.background = tv1_2.background  }
        tv2_2.setOnClickListener { ban2=tv2_2.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda2.background = tv2_2.background  }
        tv3_2.setOnClickListener { ban2=tv3_2.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda2.background = tv3_2.background   }
        tv4_2.setOnClickListener { ban2=tv4_2.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda2.background = tv4_2.background   }
        tv5_2.setOnClickListener { ban2=tv5_2.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda2.background = tv5_2.background   }
        tv6_2.setOnClickListener { ban2=tv6_2.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda2.background = tv6_2.background   }
        tv7_2.setOnClickListener { ban2=tv7_2.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda2.background = tv7_2.background   }
        tv8_2.setOnClickListener { ban2=tv8_2.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda2.background = tv8_2.background   }
        tv9_2.setOnClickListener { ban2=tv9_2.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda2.background = tv9_2.background   }
        tv10_2.setOnClickListener { ban2=tv10_2.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda2.background = tv10_2.background   }

        //banda3
        tv1_3.setOnClickListener { punto="";ban3=" Ω";valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda3.background = tv1_3.background  }
        tv2_3.setOnClickListener { punto="";ban3="0 Ω";valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda3.background = tv2_3.background  }
        tv3_3.setOnClickListener { punto=".";ban3=" kΩ";valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda3.background = tv3_3.background  }
        tv4_3.setOnClickListener { punto="";ban3=" kΩ";valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda3.background = tv4_3.background  }
        tv5_3.setOnClickListener { punto="";ban3="0 kΩ";valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda3.background = tv5_3.background  }
        tv6_3.setOnClickListener { punto=".";ban3=" MΩ";valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda3.background = tv6_3.background  }
        tv7_3.setOnClickListener { punto="";ban3=" MΩ";valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda3.background = tv7_3.background  }
        tv8_3.setOnClickListener { punto="";ban3="0 MΩ";valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda3.background = tv8_3.background  }
        tv9_3.setOnClickListener { punto=".";ban3=" GΩ";valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda3.background = tv9_3.background  }
        tv10_3.setOnClickListener { punto="";ban3=" GΩ";valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda3.background = tv10_3.background  }
        tv11_3.setOnClickListener { punto=".";ban3=" Ω";valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda3.background = tv11_3.background  }
        tv12_3.setOnClickListener { punto="0.";ban3=" Ω";valor =punto+ban1+ban2+ban3+tol;tv_resultado.text=valor;tv_banda3.background = tv12_3.background  }

        //banda4
        tv2_4.setOnClickListener { tol=tv2_4.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda4.background = tv2_4.background  }
        tv3_4.setOnClickListener { tol=tv3_4.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda4.background = tv3_4.background  }
        tv6_4.setOnClickListener { tol=tv6_4.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda4.background = tv6_4.background  }
        tv7_4.setOnClickListener { tol=tv7_4.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda4.background = tv7_4.background  }
        tv8_4.setOnClickListener { tol=tv8_4.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda4.background = tv8_4.background  }
        tv9_4.setOnClickListener { tol=tv9_4.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda4.background = tv9_4.background  }
        tv11_4.setOnClickListener { tol=tv11_4.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda4.background = tv11_4.background  }
        tv12_4.setOnClickListener { tol=tv12_4.text.toString();valor =ban1+punto+ban2+ban3+tol;tv_resultado.text=valor;tv_banda4.background = tv12_4.background  }
    }





}
