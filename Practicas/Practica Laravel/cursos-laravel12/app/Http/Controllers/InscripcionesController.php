<?php

namespace App\Http\Controllers;

use App\Models\Inscripciones;
use Illuminate\Http\Request;

class InscripcionesController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $cursos = Curso::all(); 
        return view('cursos.index', compact('cursos'));
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        return view('cursos.create');
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        $request->validate([ 'nombre'=>'required', 'descripcion'=>'required', 'fecha_inicio'=>'required|date', 'fecha_fin'=>'required|date', 'precio'=>'required|numeric' ]); Curso::create($request->all()); 
        return redirect()->route('cursos.index');
    }

    /**
     * Display the specified resource.
     */
    public function show(Inscripciones $inscripciones)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(Inscripciones $inscripciones)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Inscripciones $inscripciones)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Inscripciones $inscripciones)
    {
        //
    }
}
