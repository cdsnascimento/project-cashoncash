import Chart from "react-apexcharts";

export const ChartLine = () => {
  const options = {
    stroke: {
      width: [2, 2],
    },
    colors: ['#047cac', '#e41d35'],

    title: {
      text: "Chart",
    },
    dataLabels: {
      enabled: true,
    }

  };

  const mockData = {
    labels: {
      categories: ["2019", "2020", "2021", "LTM", "TOTAL"],
    },
    series: [
      {
        name: "Cash on Cash",
        data: [6.1, 1.4, 2.7, -0.2, 4.8],
      },
      {
        name: "Roic",
        data: [-2.1, -4.8, -3.5, -5.0, -10.4],
      },
    ],
    
  };

  return (
    <Chart
      options={{ ...options, xaxis: mockData.labels }}
      series={mockData.series}
      width="100%"
      type="line"
    />
  );
};