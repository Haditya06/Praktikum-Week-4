# Praktikum-Week-4

# 📘 Algoritma dan Pemrograman Komputer

## Bab V – Percabangan

Dokumen ini merupakan bagian dari mata kuliah **Algoritma dan Pemrograman Komputer** di **Program Studi Rekayasa Perangkat Lunak, Universitas Telkom Surabaya (2024)**.
Bab ini membahas konsep **percabangan (decision making)** dalam bahasa pemrograman **Java**, yang digunakan untuk menjalankan perintah tertentu berdasarkan kondisi logis yang terpenuhi.

---

## 🎯 Tujuan Pembelajaran

Mahasiswa diharapkan mampu:

1. Menggunakan **percabangan if-else** dan **switch-case** dengan benar.
2. Memahami proses **runtunan logika** yang menentukan jalannya program berdasarkan suatu kondisi.

---

## 🧠 Materi dan Tugas

### 🧩 **Jurnal Terbimbing**

#### 1. Prediksi Hari Lusa

Mahasiswa diminta membuat aplikasi yang dapat **menentukan hari lusa** berdasarkan input hari saat ini.
Input berupa pilihan hari (0–6) yang mewakili Minggu hingga Sabtu.
Output berupa teks yang menampilkan hari dua hari setelahnya.

**Contoh Kasus:**

* Input: 1 (Senin) → Output: “Lusa adalah hari Rabu.”
* Input: 6 (Sabtu) → Output: “Lusa adalah hari Senin.”

Latihan ini bertujuan agar mahasiswa memahami penggunaan operator aritmetika sederhana bersama percabangan `if-else` atau `switch-case` untuk menentukan hasil berdasarkan kondisi.

---

#### 2. Prediksi Bulan dan Tahun N Bulan ke Depan

Mahasiswa membuat aplikasi untuk menghitung **bulan dan tahun setelah N bulan dari waktu saat ini**.
Program menerima input berupa bulan sekarang, tahun sekarang, dan jumlah bulan ke depan.

**Contoh Kasus:**

* Input: Bulan = 10 (Oktober 2024), N = 10
  → Output: “10 bulan lagi adalah bulan Agustus 2025.”
* Input: Bulan = 10 (Oktober 2024), N = 30
  → Output: “30 bulan lagi adalah bulan April 2027.”

Latihan ini mengajarkan mahasiswa bagaimana menangani **perulangan logika bulan** dan **perubahan tahun otomatis** jika total bulan melampaui 12.

---

### 🧩 **Jurnal Mandiri**

#### 1. Prediksi Tanggal Lusa

Mahasiswa membuat aplikasi yang dapat menentukan **tanggal dua hari setelah tanggal saat ini**, dengan mempertimbangkan pergantian bulan dan tahun.
Program harus memperhitungkan kondisi khusus seperti:

* Pergantian bulan (misalnya dari 31 Oktober ke 2 November)
* Tahun kabisat pada bulan Februari
* Pergantian tahun (misalnya dari 30 Desember 2024 menjadi 1 Januari 2025)

**Contoh Kasus:**

* 14 Oktober 2024 → 16 Oktober 2024
* 31 Oktober 2024 → 2 November 2024
* 30 Desember 2024 → 1 Januari 2025
* 28 Februari 2024 → 1 Maret 2024

Latihan ini mengasah kemampuan logika **pengelolaan data waktu dan tanggal** menggunakan percabangan bersyarat yang kompleks.

---

#### 2. Konversi Angka ke Bentuk Teks

Mahasiswa diminta membuat program yang dapat **mengonversi angka (maksimal 3 digit)** menjadi bentuk tulisan dalam **bahasa Indonesia, Jawa, atau Inggris**, tergantung **akhiran NIM mahasiswa**.

**Aturan Bahasa Berdasarkan NIM:**

* Akhiran 1, 4, 7, 0 → Bahasa Indonesia
* Akhiran 2, 5, 8 → Bahasa Jawa
* Akhiran 3, 6, 9 → Bahasa Inggris

**Contoh:**

* Input: `456` → Output Bahasa Indonesia: *“Empat Ratus Lima Puluh Enam”*
* Input: `456` → Output Bahasa Jawa: *“Petang Atus Seket Enem”*
* Input: `456` → Output Bahasa Inggris: *“Four hundred and fifty six”*

Latihan ini memperkenalkan **percabangan bertingkat** dan **logika pemilihan kondisi**, serta penerapan **switch-case** untuk menentukan bahasa yang digunakan.

---

## ⚙️ Bahasa Pemrograman

Semua latihan dikerjakan menggunakan **bahasa Java**, dengan fokus pada:

* Struktur percabangan `if`, `else if`, dan `else`
* Struktur pemilihan `switch-case`
* Operator logika (`==`, `>`, `<`, `&&`, `||`)
* Penanganan nilai numerik dan teks dalam keputusan program

---

## 💡 Kesimpulan

Bab ini melatih kemampuan mahasiswa untuk membuat **program dinamis yang dapat mengambil keputusan** berdasarkan kondisi yang diberikan pengguna.
Dengan memahami percabangan, mahasiswa dapat mengontrol alur program secara fleksibel, sehingga program dapat merespons berbagai situasi atau input dengan hasil yang sesuai.
