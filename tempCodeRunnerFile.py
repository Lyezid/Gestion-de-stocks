from pytube import YouTube

def download_youtube_video(video_url, save_path=None):
    try:
        # Create a YouTube object for the video URL
        youtube = YouTube(video_url)

        # Get the highest resolution stream available (first stream in the list)
        video_stream = youtube.streams.filter(progressive=True, file_extension='mp4').first()

        if not save_path:
            # If save_path is not provided, use the default filename from the YouTube video
            save_path = video_stream.default_filename

        # Download the video to the specified path
        video_stream.download(output_path=save_path)

        print(f"Video downloaded successfully to: {save_path}")
    except Exception as e:
        print("An error occurred:", e)

if __name__ == "__main__":
    # Replace 'YOUR_YOUTUBE_VIDEO_URL' with the URL of the YouTube video you want to download
    video_url = 'https://youtu.be/VR1zoNomG3w?si=lUHfVxEO1INEEYPf'
    download_youtube_video(video_url,"/home/kali/Desktop/myvid")