<!DOCTYPE html> 
    <html lang="es"> 
        <head> 
            <meta charset="UTF-8"> 
            <title>@yield('title','Cursos')

            </title> @vite('resources/css/app.css') 
        </head> 
        <body class="bg-gray-100 text-gray-800"> 
            <nav class="bg-blue-600 p-4 text-white"> 
                <a href="{{ route('cursos.index') }}" class="mr-4">Cursos</a> 
                <a href="{{ route('personas.index') }}" class="mr-4">Personas</a> 
                <a href="{{ route('inscripciones.index') }}">Inscripciones</a> 
            </nav> 
            <div class="container mx-auto p-6"> @yield('content') 

            </div> 
        </body>
</html>