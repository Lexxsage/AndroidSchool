package com.example.task10

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val palaceSquare = LatLng(59.938180, 30.314808)
            mMap.addMarker(MarkerOptions().position(palaceSquare).title("Hello St.P"))
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(palaceSquare, 14f))
        }

    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val nsk = LatLng(55.030199, 82.920430)
        mMap.addMarker(MarkerOptions().position(nsk).title("fckNsk"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nsk))
    }


    private fun checkPermission(){
        when {
            ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED -> {

            }
            else -> {

            }

        }

    }

}