package com.admarvel.webvieworientationtest;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

@SuppressLint( { "NewApi", "SetJavaScriptEnabled" } )
public class MainActivity extends Activity
    {

	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
	    super.onCreate( savedInstanceState );
	    setContentView( R.layout.activity_main );
	    WebView webView =  (WebView)findViewById( R.id.wv );
	    webView.getSettings().setJavaScriptEnabled( true );
	    webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(
		    true );

	    webView.loadUrl( "http://172.19.19.126/test123.html" );
	    
	    webView.setWebChromeClient( new WebChromeClient() );
	    webView.setWebViewClient( new WebViewClient() ) ;
	    
	}

	@Override
	public boolean onCreateOptionsMenu( Menu menu )
	{

	    // Inflate the menu; this adds items to the action bar if it is
	    // present.
	    getMenuInflater().inflate( R.menu.main , menu );
	    return true;
	}

	@Override
	public boolean onOptionsItemSelected( MenuItem item )
	{
	    // Handle action bar item clicks here. The action bar will
	    // automatically handle clicks on the Home/Up button, so long
	    // as you specify a parent activity in AndroidManifest.xml.
	    int id = item.getItemId();
	    if ( id == R.id.action_settings )
		{
		    return true;
		}
	    return super.onOptionsItemSelected( item );
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment
	    {

		public PlaceholderFragment()
		    {
		    }

		@Override
		public View onCreateView( LayoutInflater inflater ,
			ViewGroup container , Bundle savedInstanceState )
		{
		    View rootView = inflater.inflate( R.layout.fragment_main ,
			    container , false );
		    return rootView;
		}
	    }

    }
