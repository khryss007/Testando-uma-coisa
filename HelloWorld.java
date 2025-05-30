// graficos.js
document.addEventListener('DOMContentLoaded', function() {
    // Gráfico de desafios rurais
    const ctx = document.getElementById('graficoDesafiosRurais').getContext('2d');
    const desafiosChart = new Chart(ctx, {
        type: 'bar',
        data: {
            labels: ['Êxodo Rural', 'Conectividade', 'Sustentabilidade', 'Acesso a Crédito', 'Infraestrutura'],
            datasets: [{
                label: 'Índice de Preocupação (0-100)',
                data: [78, 65, 82, 59, 70],
                backgroundColor: [
                    'rgba(46, 139, 87, 0.7)',
                    'rgba(46, 139, 87, 0.7)',
                    'rgba(46, 139, 87, 0.7)',
                    'rgba(46, 139, 87, 0.7)',
                    'rgba(46, 139, 87, 0.7)'
                ],
                borderColor: [
                    'rgba(46, 139, 87, 1)',
                    'rgba(46, 139, 87, 1)',
                    'rgba(46, 139, 87, 1)',
                    'rgba(46, 139, 87, 1)',
                    'rgba(46, 139, 87, 1)'
                ],
                borderWidth: 1
            }]
        },
        options: {
            scales: {
                y: {
                    beginAtZero: true,
                    max: 100
                }
            },
            plugins: {
                title: {
                    display: true,
                    text: 'Principais Desafios do Mundo Rural (2025)',
                    font: {
                        size: 18
                    }
                }
            }
        }
    });
});
