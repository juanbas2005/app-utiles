.class public final Ltm8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final c:Ltm8;


# instance fields
.field public final a:Lem8;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ltm8;

    .line 2
    .line 3
    invoke-direct {v0}, Ltm8;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltm8;->c:Ltm8;

    .line 7
    .line 8
    return-void
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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ltm8;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Lem8;

    .line 12
    .line 13
    invoke-direct {v0}, Lem8;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ltm8;->a:Lem8;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lwm8;
    .locals 4

    .line 1
    iget-object v0, p0, Ltm8;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_5

    .line 8
    .line 9
    iget-object p0, p0, Ltm8;->a:Lem8;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v1, Lxm8;->a:Lxb4;

    .line 15
    .line 16
    const-class v1, Lnl8;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    sget v1, Lrk8;->a:I

    .line 25
    .line 26
    :cond_0
    iget-object p0, p0, Lem8;->a:Luy5;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Luy5;->h(Ljava/lang/Class;)Lvm8;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iget v1, p0, Lvm8;->d:I

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    and-int/2addr v1, v2

    .line 36
    const/4 v3, 0x1

    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    move v1, v3

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v1, 0x0

    .line 42
    :goto_0
    if-nez v1, :cond_3

    .line 43
    .line 44
    sget v1, Lrk8;->a:I

    .line 45
    .line 46
    sget v1, Lqm8;->a:I

    .line 47
    .line 48
    sget v1, Lcm8;->a:I

    .line 49
    .line 50
    sget-object v1, Lxm8;->a:Lxb4;

    .line 51
    .line 52
    invoke-virtual {p0}, Lvm8;->a()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    add-int/lit8 v2, v2, -0x1

    .line 57
    .line 58
    if-eq v2, v3, :cond_2

    .line 59
    .line 60
    sget-object v2, Lhl8;->a:Lor2;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    const/4 v2, 0x0

    .line 64
    :goto_1
    sget v3, Lim8;->a:I

    .line 65
    .line 66
    invoke-static {p0, v1, v2}, Lom8;->z(Lvm8;Lxb4;Lor2;)Lom8;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    sget v1, Lrk8;->a:I

    .line 72
    .line 73
    sget-object v1, Lxm8;->a:Lxb4;

    .line 74
    .line 75
    sget-object v2, Lhl8;->a:Lor2;

    .line 76
    .line 77
    iget-object p0, p0, Lvm8;->a:Lpk8;

    .line 78
    .line 79
    new-instance v2, Lpm8;

    .line 80
    .line 81
    invoke-direct {v2, v1, p0}, Lpm8;-><init>(Lxb4;Lpk8;)V

    .line 82
    .line 83
    .line 84
    move-object p0, v2

    .line 85
    :goto_2
    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Lwm8;

    .line 90
    .line 91
    if-eqz p1, :cond_4

    .line 92
    .line 93
    return-object p1

    .line 94
    :cond_4
    return-object p0

    .line 95
    :cond_5
    check-cast v1, Lwm8;

    .line 96
    .line 97
    return-object v1
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method
