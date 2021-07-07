type ButtonProps = {
  text?: string | '',
  colorClass?: string | 'btn-primary',
}

export const Button = (props: ButtonProps) => {
  return (
    <button 
      type="button" 
      className="btn btn-primary"
    >
      {props.text}
    </button>
  )
}