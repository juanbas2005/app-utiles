.class public final synthetic Lhx8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lfs8;


# static fields
.field public static final synthetic x:Lhx8;

.field public static final synthetic y:Lhx8;

.field public static final synthetic z:Lhx8;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lhx8;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lhx8;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lhx8;->x:Lhx8;

    .line 8
    .line 9
    new-instance v0, Lhx8;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lhx8;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lhx8;->y:Lhx8;

    .line 16
    .line 17
    new-instance v0, Lhx8;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lhx8;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lhx8;->z:Lhx8;

    .line 24
    .line 25
    return-void
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

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lhx8;->w:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public static b(Ljava/lang/String;)Lcc9;
    .locals 9

    .line 1
    sget-object v4, Lec9;->e:Lfc9;

    .line 2
    .line 3
    invoke-static {}, Lvb9;->c()Lic9;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    iget-object v0, v6, Lic9;->b:Ljc9;

    .line 8
    .line 9
    sget-object v1, Lbc9;->C:Lbc9;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-static {v6, v0}, Lvb9;->b(Lic9;Ljc9;)Ljc9;

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    move v7, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v7, v2

    .line 22
    :goto_0
    if-nez v0, :cond_2

    .line 23
    .line 24
    sget-object v0, Lwb9;->c:Lwb9;

    .line 25
    .line 26
    invoke-virtual {v0}, Lwb9;->b()Ljava/util/UUID;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, Lqb9;->a(Ljava/util/UUID;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    sget-object v5, Lzb9;->C:Lcom/google/android/gms/internal/measurement/zzvr;

    .line 35
    .line 36
    sget-object v0, Lvb9;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ls93;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_1

    .line 49
    .line 50
    new-instance v3, Lzp8;

    .line 51
    .line 52
    const/4 v8, 0x2

    .line 53
    invoke-direct {v3, v8}, Lzp8;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v0, v3}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    new-instance v0, Lac9;

    .line 60
    .line 61
    move-object v3, p0

    .line 62
    invoke-direct/range {v0 .. v6}, Lac9;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lfc9;Lcom/google/android/gms/internal/measurement/zzvr;Lic9;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move-object v3, p0

    .line 67
    instance-of p0, v0, Lsb9;

    .line 68
    .line 69
    if-eqz p0, :cond_3

    .line 70
    .line 71
    check-cast v0, Lsb9;

    .line 72
    .line 73
    invoke-interface {v0, v3, v4, v2, v6}, Lsb9;->U(Ljava/lang/String;Lfc9;ZLic9;)Lac9;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-interface {v0, v3, v4, v6}, Ljc9;->S(Ljava/lang/String;Lfc9;Lic9;)Ljc9;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    :goto_1
    invoke-static {v6, v0}, Lvb9;->b(Lic9;Ljc9;)Ljc9;

    .line 83
    .line 84
    .line 85
    new-instance p0, Lcc9;

    .line 86
    .line 87
    invoke-direct {p0, v0, v7}, Lcc9;-><init>(Ljc9;Z)V

    .line 88
    .line 89
    .line 90
    return-object p0
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


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 3

    .line 1
    iget p0, p0, Lhx8;->w:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, Lmo8;->x:Lmo8;

    .line 7
    .line 8
    iget-object p0, p0, Lmo8;->w:La87;

    .line 9
    .line 10
    iget-object p0, p0, La87;->w:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lno8;

    .line 13
    .line 14
    sget-object p0, Lno8;->b:Lg79;

    .line 15
    .line 16
    invoke-virtual {p0}, Lt79;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    new-instance v0, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Ljava/lang/Boolean;-><init>(Z)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_0
    sget-object p0, Lby8;->a:Ljava/util/List;

    .line 33
    .line 34
    sget-object p0, Lwo8;->x:Lwo8;

    .line 35
    .line 36
    invoke-virtual {p0}, Lwo8;->b()Lxo8;

    .line 37
    .line 38
    .line 39
    sget-object p0, Lxo8;->a:Lk68;

    .line 40
    .line 41
    const/4 v0, 0x4

    .line 42
    const/4 v1, 0x1

    .line 43
    const-string v2, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once"

    .line 44
    .line 45
    invoke-virtual {p0, v0, v2, v1}, Lk68;->n(ILjava/lang/String;Z)Lt79;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Lt79;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Ljava/lang/Boolean;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_1
    sget-object p0, Lby8;->a:Ljava/util/List;

    .line 57
    .line 58
    sget-object p0, Lgo8;->x:Lgo8;

    .line 59
    .line 60
    iget-object p0, p0, Lgo8;->w:La87;

    .line 61
    .line 62
    iget-object p0, p0, La87;->w:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, Lho8;

    .line 65
    .line 66
    sget-object p0, Lho8;->b:Lg79;

    .line 67
    .line 68
    invoke-virtual {p0}, Lt79;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, Ljava/lang/Boolean;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
