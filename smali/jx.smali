.class public final Ljx;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lq25;


# static fields
.field public static final a:Ljx;

.field public static final b:Lkc2;

.field public static final c:Lkc2;

.field public static final d:Lkc2;

.field public static final e:Lkc2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljx;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ljx;->a:Ljx;

    .line 7
    .line 8
    const-string v0, "baseAddress"

    .line 9
    .line 10
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Ljx;->b:Lkc2;

    .line 15
    .line 16
    const-string v0, "size"

    .line 17
    .line 18
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Ljx;->c:Lkc2;

    .line 23
    .line 24
    const-string v0, "name"

    .line 25
    .line 26
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Ljx;->d:Lkc2;

    .line 31
    .line 32
    const-string v0, "uuid"

    .line 33
    .line 34
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Ljx;->e:Lkc2;

    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Laa1;

    .line 2
    .line 3
    check-cast p2, Lr25;

    .line 4
    .line 5
    move-object p0, p1

    .line 6
    check-cast p0, Luz;

    .line 7
    .line 8
    iget-wide v0, p0, Luz;->a:J

    .line 9
    .line 10
    sget-object p0, Ljx;->b:Lkc2;

    .line 11
    .line 12
    invoke-interface {p2, p0, v0, v1}, Lr25;->g(Lkc2;J)Lr25;

    .line 13
    .line 14
    .line 15
    check-cast p1, Luz;

    .line 16
    .line 17
    iget-wide v0, p1, Luz;->b:J

    .line 18
    .line 19
    sget-object p0, Ljx;->c:Lkc2;

    .line 20
    .line 21
    invoke-interface {p2, p0, v0, v1}, Lr25;->g(Lkc2;J)Lr25;

    .line 22
    .line 23
    .line 24
    sget-object p0, Ljx;->d:Lkc2;

    .line 25
    .line 26
    iget-object v0, p1, Luz;->c:Ljava/lang/String;

    .line 27
    .line 28
    invoke-interface {p2, p0, v0}, Lr25;->a(Lkc2;Ljava/lang/Object;)Lr25;

    .line 29
    .line 30
    .line 31
    iget-object p0, p1, Luz;->d:Ljava/lang/String;

    .line 32
    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    sget-object p1, Lra1;->a:Ljava/nio/charset/Charset;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 p0, 0x0

    .line 43
    :goto_0
    sget-object p1, Ljx;->e:Lkc2;

    .line 44
    .line 45
    invoke-interface {p2, p1, p0}, Lr25;->a(Lkc2;Ljava/lang/Object;)Lr25;

    .line 46
    .line 47
    .line 48
    return-void
    .line 49
    .line 50
    .line 51
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
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
