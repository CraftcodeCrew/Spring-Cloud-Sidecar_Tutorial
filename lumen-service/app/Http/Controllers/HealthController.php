<?php
/**
 * Created by PhpStorm.
 * User: leong
 * Date: 20.08.2018
 * Time: 12:04
 */

namespace App\Http\Controllers;


class HealthController extends Controller
{

    public function heartbeat()
    {
        return response()->json(['status' => 'UP'])->withHeaders(['Content-Type' => 'application/json']);
    }

}