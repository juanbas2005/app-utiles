.class public final Lhi8;
.super Lcom/google/android/gms/common/api/internal/BasePendingResult;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic k:I


# direct methods
.method public constructor <init>(Lpg8;I)V
    .locals 0

    .line 1
    iput p2, p0, Lhi8;->k:I

    .line 2
    .line 3
    const-string p2, "GoogleApiClient must not be null"

    .line 4
    .line 5
    invoke-static {p2, p1}, Lz65;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(Lpg8;)V

    .line 9
    .line 10
    .line 11
    const-string p0, "Api must not be null"

    .line 12
    .line 13
    sget-object p1, Lvu;->a:Lqc3;

    .line 14
    .line 15
    invoke-static {p0, p1}, Lz65;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method


# virtual methods
.method public final bridge synthetic b(Lcom/google/android/gms/common/api/Status;)Lp66;
    .locals 0

    .line 1
    iget p0, p0, Lhi8;->k:I

    .line 2
    .line 3
    return-object p1
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final f(Liw2;)V
    .locals 3

    .line 1
    iget v0, p0, Lhi8;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lei8;

    .line 7
    .line 8
    invoke-virtual {p1}, Ly50;->l()Landroid/os/IInterface;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lli8;

    .line 13
    .line 14
    new-instance v1, Lgi8;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v1, p0, v2}, Lgi8;-><init>(Lhi8;I)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p1, Lei8;->A:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 21
    .line 22
    invoke-virtual {v0}, Lgg8;->a()Landroid/os/Parcel;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget v2, Lbi8;->a:I

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p0}, Lbi8;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 32
    .line 33
    .line 34
    const/16 p0, 0x67

    .line 35
    .line 36
    invoke-virtual {v0, p1, p0}, Lgg8;->b(Landroid/os/Parcel;I)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_0
    check-cast p1, Lei8;

    .line 41
    .line 42
    invoke-virtual {p1}, Ly50;->l()Landroid/os/IInterface;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lli8;

    .line 47
    .line 48
    new-instance v1, Lgi8;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-direct {v1, p0, v2}, Lgi8;-><init>(Lhi8;I)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p1, Lei8;->A:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 55
    .line 56
    invoke-virtual {v0}, Lgg8;->a()Landroid/os/Parcel;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    sget v2, Lbi8;->a:I

    .line 61
    .line 62
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1, p0}, Lbi8;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 66
    .line 67
    .line 68
    const/16 p0, 0x66

    .line 69
    .line 70
    invoke-virtual {v0, p1, p0}, Lgg8;->b(Landroid/os/Parcel;I)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 76
.end method

.method public final g(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    const-string v1, "Failed result must not be success"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lz65;->e(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->b(Lcom/google/android/gms/common/api/Status;)Lp66;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e(Lp66;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
