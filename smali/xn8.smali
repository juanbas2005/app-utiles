.class public final Lxn8;
.super La3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lxn8;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public A:Z

.field public B:Ljava/lang/String;

.field public final C:Lzr8;

.field public D:J

.field public E:Lzr8;

.field public final F:J

.field public final G:Lzr8;

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/String;

.field public y:Lz89;

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lki8;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lki8;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lxn8;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
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
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lz89;JZLjava/lang/String;Lzr8;JLzr8;JLzr8;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lxn8;->w:Ljava/lang/String;

    iput-object p2, p0, Lxn8;->x:Ljava/lang/String;

    iput-object p3, p0, Lxn8;->y:Lz89;

    iput-wide p4, p0, Lxn8;->z:J

    iput-boolean p6, p0, Lxn8;->A:Z

    iput-object p7, p0, Lxn8;->B:Ljava/lang/String;

    iput-object p8, p0, Lxn8;->C:Lzr8;

    iput-wide p9, p0, Lxn8;->D:J

    iput-object p11, p0, Lxn8;->E:Lzr8;

    iput-wide p12, p0, Lxn8;->F:J

    iput-object p14, p0, Lxn8;->G:Lzr8;

    return-void
.end method

.method public constructor <init>(Lxn8;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lz65;->k(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, Lxn8;->w:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lxn8;->w:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v0, p1, Lxn8;->x:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v0, p0, Lxn8;->x:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v0, p1, Lxn8;->y:Lz89;

    .line 16
    .line 17
    iput-object v0, p0, Lxn8;->y:Lz89;

    .line 18
    .line 19
    iget-wide v0, p1, Lxn8;->z:J

    .line 20
    .line 21
    iput-wide v0, p0, Lxn8;->z:J

    .line 22
    .line 23
    iget-boolean v0, p1, Lxn8;->A:Z

    .line 24
    .line 25
    iput-boolean v0, p0, Lxn8;->A:Z

    .line 26
    .line 27
    iget-object v0, p1, Lxn8;->B:Ljava/lang/String;

    .line 28
    .line 29
    iput-object v0, p0, Lxn8;->B:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v0, p1, Lxn8;->C:Lzr8;

    .line 32
    .line 33
    iput-object v0, p0, Lxn8;->C:Lzr8;

    .line 34
    .line 35
    iget-wide v0, p1, Lxn8;->D:J

    .line 36
    .line 37
    iput-wide v0, p0, Lxn8;->D:J

    .line 38
    .line 39
    iget-object v0, p1, Lxn8;->E:Lzr8;

    .line 40
    .line 41
    iput-object v0, p0, Lxn8;->E:Lzr8;

    .line 42
    .line 43
    iget-wide v0, p1, Lxn8;->F:J

    .line 44
    .line 45
    iput-wide v0, p0, Lxn8;->F:J

    .line 46
    .line 47
    iget-object p1, p1, Lxn8;->G:Lzr8;

    .line 48
    .line 49
    iput-object p1, p0, Lxn8;->G:Lzr8;

    .line 50
    .line 51
    return-void
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, v0}, Lh75;->M(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    iget-object v2, p0, Lxn8;->w:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p1, v1, v2}, Lh75;->F(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    iget-object v2, p0, Lxn8;->x:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p1, v1, v2}, Lh75;->F(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lxn8;->y:Lz89;

    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    invoke-static {p1, v2, v1, p2}, Lh75;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 23
    .line 24
    .line 25
    iget-wide v3, p0, Lxn8;->z:J

    .line 26
    .line 27
    const/4 v1, 0x5

    .line 28
    const/16 v5, 0x8

    .line 29
    .line 30
    invoke-static {p1, v1, v5}, Lh75;->K(Landroid/os/Parcel;II)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    .line 34
    .line 35
    .line 36
    iget-boolean v1, p0, Lxn8;->A:Z

    .line 37
    .line 38
    const/4 v3, 0x6

    .line 39
    invoke-static {p1, v3, v2}, Lh75;->K(Landroid/os/Parcel;II)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x7

    .line 46
    iget-object v2, p0, Lxn8;->B:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p1, v1, v2}, Lh75;->F(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lxn8;->C:Lzr8;

    .line 52
    .line 53
    invoke-static {p1, v5, v1, p2}, Lh75;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 54
    .line 55
    .line 56
    iget-wide v1, p0, Lxn8;->D:J

    .line 57
    .line 58
    const/16 v3, 0x9

    .line 59
    .line 60
    invoke-static {p1, v3, v5}, Lh75;->K(Landroid/os/Parcel;II)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v1, v2}, Landroid/os/Parcel;->writeLong(J)V

    .line 64
    .line 65
    .line 66
    const/16 v1, 0xa

    .line 67
    .line 68
    iget-object v2, p0, Lxn8;->E:Lzr8;

    .line 69
    .line 70
    invoke-static {p1, v1, v2, p2}, Lh75;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 71
    .line 72
    .line 73
    const/16 v1, 0xb

    .line 74
    .line 75
    invoke-static {p1, v1, v5}, Lh75;->K(Landroid/os/Parcel;II)V

    .line 76
    .line 77
    .line 78
    iget-wide v1, p0, Lxn8;->F:J

    .line 79
    .line 80
    invoke-virtual {p1, v1, v2}, Landroid/os/Parcel;->writeLong(J)V

    .line 81
    .line 82
    .line 83
    const/16 v1, 0xc

    .line 84
    .line 85
    iget-object p0, p0, Lxn8;->G:Lzr8;

    .line 86
    .line 87
    invoke-static {p1, v1, p0, p2}, Lh75;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 88
    .line 89
    .line 90
    invoke-static {p1, v0}, Lh75;->O(Landroid/os/Parcel;I)V

    .line 91
    .line 92
    .line 93
    return-void
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method
