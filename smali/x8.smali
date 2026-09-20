.class public final synthetic Lx8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lq54;


# instance fields
.field public final synthetic w:Lpv0;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lr8;

.field public final synthetic z:Lhj8;


# direct methods
.method public synthetic constructor <init>(Lpv0;Ljava/lang/String;Lr8;Lhj8;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx8;->w:Lpv0;

    .line 5
    .line 6
    iput-object p2, p0, Lx8;->x:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lx8;->y:Lr8;

    .line 9
    .line 10
    iput-object p4, p0, Lx8;->z:Lhj8;

    .line 11
    .line 12
    return-void
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method


# virtual methods
.method public final o(Lt54;Lj54;)V
    .locals 4

    .line 1
    sget-object p1, Lj54;->ON_START:Lj54;

    .line 2
    .line 3
    iget-object v0, p0, Lx8;->w:Lpv0;

    .line 4
    .line 5
    iget-object v1, p0, Lx8;->x:Ljava/lang/String;

    .line 6
    .line 7
    if-ne p1, p2, :cond_1

    .line 8
    .line 9
    iget-object p1, v0, Lpv0;->e:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    iget-object p2, v0, Lpv0;->g:Landroid/os/Bundle;

    .line 12
    .line 13
    iget-object v0, v0, Lpv0;->f:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    new-instance v2, Ly8;

    .line 16
    .line 17
    iget-object v3, p0, Lx8;->y:Lr8;

    .line 18
    .line 19
    iget-object p0, p0, Lx8;->z:Lhj8;

    .line 20
    .line 21
    invoke-direct {v2, v3, p0}, Ly8;-><init>(Lr8;Lhj8;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-interface {v3, p1}, Lr8;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    const-class p1, Lq8;

    .line 44
    .line 45
    invoke-static {p2, v1, p1}, Lgr8;->M(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lq8;

    .line 50
    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    invoke-virtual {p2, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget p2, p1, Lq8;->w:I

    .line 57
    .line 58
    iget-object p1, p1, Lq8;->x:Landroid/content/Intent;

    .line 59
    .line 60
    invoke-virtual {p0, p1, p2}, Lhj8;->D(Landroid/content/Intent;I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-interface {v3, p0}, Lr8;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    sget-object p0, Lj54;->ON_STOP:Lj54;

    .line 69
    .line 70
    if-ne p0, p2, :cond_2

    .line 71
    .line 72
    iget-object p0, v0, Lpv0;->e:Ljava/util/LinkedHashMap;

    .line 73
    .line 74
    invoke-interface {p0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    sget-object p0, Lj54;->ON_DESTROY:Lj54;

    .line 79
    .line 80
    if-ne p0, p2, :cond_3

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Lpv0;->e(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_3
    return-void
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
