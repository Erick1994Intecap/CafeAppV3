package com.aesc.santos.gitanoapp.Fragments;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.aesc.santos.gitanoapp.Adaptadores.AdaptadorTienda;
import com.aesc.santos.gitanoapp.Adaptadores.AdaptadorTiendaDetalle;
import com.aesc.santos.gitanoapp.Entidades.ProductosVo;
import com.aesc.santos.gitanoapp.Entidades.UbicacionesTienda;
import com.aesc.santos.gitanoapp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TiendaDetalleFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TiendaDetalleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TiendaDetalleFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private static final String TAG = "TiendaDetalleFragment";
    private int position;
    ImageView fotoUbicacion;
    ArrayList<UbicacionesTienda> ubicacionesTiendas;
    RecyclerView recyclerTienda;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public TiendaDetalleFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TiendaDetalleFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TiendaDetalleFragment newInstance(String param1, String param2) {
        TiendaDetalleFragment fragment = new TiendaDetalleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            position = getArguments().getInt("key", 0);
            //Toast.makeText(getContext(), "eshta" + position, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tienda_detalle, container, false);
        Log.d(TAG, "onCreateView: ESTIY AQYU");
        fotoUbicacion = view.findViewById(R.id.fotoUbicacion);


        ubicacionesTiendas = new ArrayList<>();
        recyclerTienda = view.findViewById(R.id.recyclerTiendaDetalle);
        recyclerTienda.setLayoutManager(new LinearLayoutManager(getActivity()));

        if (position == 0) {
            Log.d(TAG, "onCreateView: Zona 1.");
            seleccionZona1();
        } else if (position == 1) {
            Log.d(TAG, "Zona 3");
            seleccionZona3();
        } else if (position == 2) {
            Log.d(TAG, "Zona 4");
            seleccionZona4();
        } else if (position == 3) {
            Log.d(TAG, "Zona 5");
            seleccionZona5();
        } else if (position == 4) {
            Log.d(TAG, "Zona 7");
            seleccionZona7();
        } else if (position == 5) {
            Log.d(TAG, "Zona 9");
            seleccionZona9();
        } else if (position == 6) {
            Log.d(TAG, "Zona 10");
            seleccionZona10();
        } else if (position == 7) {
            Log.d(TAG, "Zona 11");
            seleccionZona11();
        } else if (position == 8) {
            Log.d(TAG, "Zona 12");
            seleccionZona12();
        } else if (position == 9) {
            Log.d(TAG, "Zona 13");
            seleccionZona13();
        } else if (position == 10) {
            Log.d(TAG, "Zona 14");
            seleccionZona14();
        } else if (position == 11) {
            Log.d(TAG, "Zona 15");
            seleccionZona15();
        } else if (position == 12) {
            Log.d(TAG, "Zona 16");
            seleccionZona16();

        } else if (position == 13) {
            Log.d(TAG, "Zona 17");
            seleccionZona17();
        }
        AdaptadorTiendaDetalle adapters = new AdaptadorTiendaDetalle(ubicacionesTiendas);
        recyclerTienda.setAdapter(adapters);

        return view;
    }

    private void seleccionZona9() {


        // Picasso.with(getContext()).load("https://cdn-pro.elsalvador.com/wp-content/uploads/2017/01/30182002/1476896384419.jpg")
        //.into(fotoUbicacion);
    }

    private void seleccionZona7() {
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.cla_citano_de_jamon));
        ubicacionesTiendas.add(new UbicacionesTienda("Hoasdsala", R.drawable.cla_citano_de_jamon));
        ubicacionesTiendas.add(new UbicacionesTienda("Holasdasdasda", R.drawable.cla_citano_de_jamon));

    }

    private void seleccionZona10() {
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
    }

    private void seleccionZona11() {
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
    }

    private void seleccionZona12() {
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
    }

    private void seleccionZona13() {
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
    }

    private void seleccionZona14() {
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda("Hola", R.drawable.c_americano));
    }

    private void seleccionZona15() {

    }

    private void seleccionZona17() {
    }

    private void seleccionZona16() {
    }

    private void seleccionZona5() {
    }

    private void seleccionZona4() {
    }

    private void seleccionZona3() {
    }

    private void seleccionZona1() {
        ubicacionesTiendas.add(new UbicacionesTienda(getString(R.string.caliente_americano), R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda(getString(R.string.caliente_americano), R.drawable.c_americano));
        ubicacionesTiendas.add(new UbicacionesTienda(getString(R.string.caliente_americano), R.drawable.c_americano));
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

   /* @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }*/

    /*@Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }*/

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
