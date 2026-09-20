.class public Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fcm"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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
.end method

.method public static synthetic a(Lav5;Lkd6;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->lambda$getComponents$0(Lav5;Ltv0;)Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method private static synthetic lambda$getComponents$0(Lav5;Ltv0;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 7

    .line 1
    new-instance v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    const-class v1, Loe2;

    .line 4
    .line 5
    invoke-interface {p1, v1}, Ltv0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Loe2;

    .line 10
    .line 11
    const-class v2, Lxe2;

    .line 12
    .line 13
    invoke-interface {p1, v2}, Ltv0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    const-class v2, Lho1;

    .line 20
    .line 21
    invoke-interface {p1, v2}, Ltv0;->h(Ljava/lang/Class;)Lnu5;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-class v3, Ljz2;

    .line 26
    .line 27
    invoke-interface {p1, v3}, Ltv0;->h(Ljava/lang/Class;)Lnu5;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-class v4, Lwe2;

    .line 32
    .line 33
    invoke-interface {p1, v4}, Ltv0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Lwe2;

    .line 38
    .line 39
    invoke-interface {p1, p0}, Ltv0;->r(Lav5;)Lnu5;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const-class p0, Lw67;

    .line 44
    .line 45
    invoke-interface {p1, p0}, Ltv0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    move-object v6, p0

    .line 50
    check-cast v6, Lw67;

    .line 51
    .line 52
    invoke-direct/range {v0 .. v6}, Lcom/google/firebase/messaging/FirebaseMessaging;-><init>(Loe2;Lnu5;Lnu5;Lwe2;Lnu5;Lw67;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_0
    invoke-static {}, Lku4;->a()V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0
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


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgv0;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Lav5;

    .line 2
    .line 3
    const-class v0, Lan7;

    .line 4
    .line 5
    const-class v1, Lcn7;

    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 11
    .line 12
    invoke-static {v0}, Lgv0;->b(Ljava/lang/Class;)Lfv0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "fire-fcm"

    .line 17
    .line 18
    iput-object v1, v0, Lfv0;->a:Ljava/lang/String;

    .line 19
    .line 20
    const-class v2, Loe2;

    .line 21
    .line 22
    invoke-static {v2}, Lzp1;->c(Ljava/lang/Class;)Lzp1;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v2}, Lfv0;->a(Lzp1;)V

    .line 27
    .line 28
    .line 29
    new-instance v2, Lzp1;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const-class v4, Lxe2;

    .line 33
    .line 34
    invoke-direct {v2, v3, v3, v4}, Lzp1;-><init>(IILjava/lang/Class;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2}, Lfv0;->a(Lzp1;)V

    .line 38
    .line 39
    .line 40
    const-class v2, Lho1;

    .line 41
    .line 42
    invoke-static {v2}, Lzp1;->a(Ljava/lang/Class;)Lzp1;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v0, v2}, Lfv0;->a(Lzp1;)V

    .line 47
    .line 48
    .line 49
    const-class v2, Ljz2;

    .line 50
    .line 51
    invoke-static {v2}, Lzp1;->a(Ljava/lang/Class;)Lzp1;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v0, v2}, Lfv0;->a(Lzp1;)V

    .line 56
    .line 57
    .line 58
    const-class v2, Lwe2;

    .line 59
    .line 60
    invoke-static {v2}, Lzp1;->c(Ljava/lang/Class;)Lzp1;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v0, v2}, Lfv0;->a(Lzp1;)V

    .line 65
    .line 66
    .line 67
    new-instance v2, Lzp1;

    .line 68
    .line 69
    const/4 v4, 0x1

    .line 70
    invoke-direct {v2, p0, v3, v4}, Lzp1;-><init>(Lav5;II)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v2}, Lfv0;->a(Lzp1;)V

    .line 74
    .line 75
    .line 76
    const-class v2, Lw67;

    .line 77
    .line 78
    invoke-static {v2}, Lzp1;->c(Ljava/lang/Class;)Lzp1;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v0, v2}, Lfv0;->a(Lzp1;)V

    .line 83
    .line 84
    .line 85
    new-instance v2, Lul1;

    .line 86
    .line 87
    invoke-direct {v2, p0, v4}, Lul1;-><init>(Lav5;I)V

    .line 88
    .line 89
    .line 90
    iput-object v2, v0, Lfv0;->g:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-virtual {v0, v4}, Lfv0;->c(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Lfv0;->b()Lgv0;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    const-string v0, "25.1.0"

    .line 100
    .line 101
    invoke-static {v1, v0}, Lgw8;->q(Ljava/lang/String;Ljava/lang/String;)Lgv0;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    filled-new-array {p0, v0}, [Lgv0;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method
