import Chart from "react-apexcharts";

export const ChartBar = () => {
  const options = {
    plotOptions: {
      bar: {
        horizontal: false,
        dataLabels: {
          position: 'top'
        }
      }
    },
    yaxis: {
      min: -9000,
      max: 23000
    },
    colors: ['#047cac', '#e41d35']

  };

  const mockData = {
    labels: {
      categories: ["2019", "2020", "2021", "LTM", "TOTAL"],
    },
    series: [
      {
        name: "EBITDA",
        data: [21040, 949, -4187, -69, 8377],
      },
      {
        name: "EBIT",
        data: [5386, -5140, -8345, -4994, -1337],
      },
    ],
  };

  return (
    <Chart
      options={{ ...options, xaxis: mockData.labels }}
      series={mockData.series}
      width="100%"
      type="bar"
    />
  );
};